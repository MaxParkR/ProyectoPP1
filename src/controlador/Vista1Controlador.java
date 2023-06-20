/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.VBox;

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

    /**  El siguiente evento nos permite detectar si se oprimió espacio y omitirlo dentro de los campos
     * txtUserName y txtPassword, con esto se logra tener un formato establecido en los campos en los que 
     * no se puedan colocar espacios ni en el User Name como en el Password    
     */
    @FXML
    private void eventKey(KeyEvent event) {
        Object evt = event.getSource();

        if (event.getEventType() == KeyEvent.KEY_TYPED) {
            if (evt.equals(txtUserName)) {
                if (event.getCharacter().equals(" ")) {
                    event.consume();
                }
            } else if (evt.equals(txtPassword)) {
                if (event.getCharacter().equals(" ")) {
                    event.consume();
                }
            }
        }
    }

    @FXML
    private void eventAction(ActionEvent event) throws IOException {

        Object evt = event.getSource();

        if (evt.equals(btnSubmit)) {
            if (!txtUserName.getText().isEmpty() && !txtPassword.getText().isEmpty()) {
                //String usuario = txtUserName.getText();
                //String contraseña = txtPassword.getText();

                cargarEscena("/vista/VistaMenu.fxml", event);

            } else {
                System.out.println("error");
            }

        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void cargarEscena(String url, Event event) throws IOException {

        ((Node) (event.getSource())).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource(url));
        Scene scene = new Scene(root);
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();

    }
}
