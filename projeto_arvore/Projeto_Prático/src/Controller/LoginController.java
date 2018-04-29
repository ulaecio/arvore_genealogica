package Controller;

import Main.CadastrarLogin;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import Main.Login;
import Main.Principal;
import javafx.event.ActionEvent;

public class LoginController implements Initializable {
    @FXML private PasswordField textPassword;
    @FXML private Button btEntrar;
    @FXML private TextField textEmail;
    @FXML private Label label;
    @FXML private Button btCadastrar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btEntrar.setOnMouseClicked((MouseEvent e)->{
            logar();
        });
        btEntrar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                logar();
            }
        });
        
        btCadastrar.setOnMouseClicked((MouseEvent e)->{
            CadastrarLogin login = new CadastrarLogin();
            fecha();
            try {
                login.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(CadastrarLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
      
        
        textPassword.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                logar();
            }
        });
    }
    private void fecha() {
        Login.getStage().close();
    }
    public void logar(){
        if(textEmail.getText().equals("root") && textPassword.getText().equals("1234")){
            Principal p = new Principal();
            fecha();
            try {
                p.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Erro");
            alert.setTitle("Login Inválido");
            alert.setContentText("Usuário ou senha não cadastrado!");
            alert.show();
        }
    }
    
    public void cadastrar(ActionEvent event) {
        
    

    }

}