/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author Mateo
 */
public class Vista1Controlador implements Initializable {

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnSubmit;

    @FXML
    private void eventKey(KeyEvent event) {
        
        Object evt = event.getSource();

        if (evt.equals(txtUserName)) {
            
            if (event.getCharacter().equals(" ")){
                event.consume();
            }

        } else if (evt.equals(txtPassword)) {
             if (event.getCharacter().equals(" ")){
                event.consume();
            }    
        }

    }

    @FXML
    private void eventAction(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
