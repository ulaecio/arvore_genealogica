package Controller;

import DAO.LogonDao;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import Main.CadastrarLogin;
import Main.Login;
import Model.Logon;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class CadastrarLoginController implements Initializable {
    @FXML private Button btCancelar;
    @FXML private TextField txtEmail;
    @FXML private PasswordField txtSenha;
    @FXML private PasswordField txtConfSenha;
    @FXML private Button btSalvar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btSalvar.setOnMouseClicked((MouseEvent e)->{
            cadastrarLogin();
            
        });
        
        btSalvar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                cadastrarLogin();
            }
        });
        
        btCancelar.setOnMouseClicked((MouseEvent e)->{
          abreLogin();
        });
        
        btCancelar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                abreLogin();
            }
        });
        
    }
    public void fecha(){
        CadastrarLogin.getStage().close();
    }            
    
    private void cadastrarLogin(){
        String email = txtEmail.getText(), 
               senha = txtSenha.getText(), 
               confsenha = txtConfSenha.getText();
        
        if(senha.equals(confsenha)){
            Logon l = new Logon(email, senha, confsenha);
            LogonDao dao = new LogonDao();
            if (dao.add(l)){
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setHeaderText("Usuário cadastrado!");
                alert.showAndWait();
                fecha();
                abreLogin();
                
                
            }else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.setHeaderText("Usuário não cadastrado!");
                alert.show();
            }
            
            l.setEmail(email);
            l.setSenha(senha);
            l.setConfsenha(confsenha);
            
        }else{
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setHeaderText("As senhas não são iguais!");
            alerta.show();
        }
        
    }
    
    public void abreLogin(){
        Login a = new Login();
        fecha();
        try {
            a.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(CadastrarLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
                

        

    

