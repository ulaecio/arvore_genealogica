/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import Main.CadastrarPessoa;
import Main.Principal;

/**
 * FXML Controller class
 *
 * @author Nando
 */
public class PrincipalController implements Initializable {
    
    @FXML private Button btCadFamiliar;
    @FXML private Button btExcluirDados;
    @FXML private Button btAlterarDados;
    @FXML private Button btVisualizar;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btCadFamiliar.setOnMouseClicked((MouseEvent e)->{
            CadastrarPessoa cad = new CadastrarPessoa();
            Principal.getStage().close();
            try {
                cad.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        btCadFamiliar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
            CadastrarPessoa cad = new CadastrarPessoa();
            Principal.getStage().close();
            try {
                cad.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });
        
        btExcluirDados.setOnMouseClicked((MouseEvent e)->{
            
        });
        
        btExcluirDados.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                
            }
        });
        
        btAlterarDados.setOnMouseClicked((MouseEvent e)->{
            
        });
        
        btAlterarDados.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
              
            }
        });
        
        btVisualizar.setOnMouseClicked((MouseEvent e)->{
          
        });
        
        btVisualizar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                
            }
        });
        
    
}
    
}
