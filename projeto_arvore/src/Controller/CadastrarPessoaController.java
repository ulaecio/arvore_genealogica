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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Nando
 */
public class CadastrarPessoaController implements Initializable {
    @FXML private Button btLimpar;
    @FXML private RadioButton btMasculino;
    @FXML private TextField txtNome;
    @FXML private Button btCadastrar;
    @FXML private RadioButton btFeminino;
    @FXML private TextField txtParentesco;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
