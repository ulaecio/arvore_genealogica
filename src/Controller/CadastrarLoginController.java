/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Nando
 */
public class CadastrarLoginController implements Initializable {
    @FXML
    private Button btLimpar;
    @FXML
    private PasswordField txtDtNascimento;
    @FXML
    private TextField textEmail;
    @FXML
    private PasswordField psSenha;
    @FXML
    private Button btCadastrar;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
