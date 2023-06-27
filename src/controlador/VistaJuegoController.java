/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Mateo
 */
public class VistaJuegoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML 
    private Label timer;
    
    
    private String jugadorSeleccionado;
    private String tiempoSeleccionado;
    private String lenguajeSeleccionado;
    private Timeline timeline;
   
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
