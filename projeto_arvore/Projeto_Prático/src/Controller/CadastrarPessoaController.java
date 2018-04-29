/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.PessoaDao;
import Main.Principal;
import Model.Pessoa;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nando Nunes
 */
public class CadastrarPessoaController implements Initializable {
    @FXML private Button btCancelar;
    @FXML private TextField txtNome;
    @FXML private Button btSalvar;
    @FXML private TextField txtParentesco;
    @FXML private TextField txtNascimento;
    @FXML private TextField txtSexo;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btSalvar.setOnMouseClicked((MouseEvent e)->{
            cadastrarParente();
            
        });
        
        btSalvar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                cadastrarParente();
            }
        });
        
        btCancelar.setOnMouseClicked((MouseEvent e)->{
          abrePrincipal();
        });
        
        btCancelar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                abrePrincipal();
            }
        });
        
    }
    public void fecha(){
        
    }            
    
    private void cadastrarParente(){
        String nome = txtNome.getText(), 
               dtNascimento = txtNascimento.getText(), 
               sexo = txtSexo.getText(),
               parentesco = txtParentesco.getText();
        
            Pessoa c = new Pessoa (nome, dtNascimento, sexo, parentesco);
            PessoaDao dao = new PessoaDao();
            /*if (dao.add(c)){
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setHeaderText("Usuário cadastrado!");
                alert.showAndWait();
                fecha();
                abrePrincipal();
                
            }else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.setHeaderText("Usuário não cadastrado!");
                alert.show();
            }*/
            
            c.setNome(nome);
            c.setDtNascimento(dtNascimento);
            c.setSexo(sexo);
            c.setParentesco(parentesco);
    }
    
    public void abrePrincipal(){
        Principal a = new Principal();
        
        try {
            a.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(CadastrarPessoaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}