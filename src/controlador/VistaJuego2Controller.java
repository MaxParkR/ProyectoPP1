/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import static controlador.AbrirVentana.cargarEscena;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import modelo.GeneradorDePalabras;
import modelo.Juego;
import modelo.MostrarPalabra;

/**
 * FXML Controller class
 *
 * @author Mateo
 */
public class VistaJuego2Controller implements Initializable {

    @FXML
    public ChoiceBox<String> opcionesTiempo;

    @FXML
    public ChoiceBox<String> opcionesLenguaje;

    @FXML
    private Label timer;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnExit;

    private Juego juego;

    private GeneradorDePalabras generadorDePalabras;

    private MostrarPalabra mostrarPalabra;

    private Timeline timeline;
    
    private int tiempoRestante;

    private final String[] tiempo = {"1 minuto", "2 minutos", "3 minutos", "4 minutos"};

    private final String[] lenguaje = {"Español", "Inglés"};

    private String lenguajeSeleccionado;

    private String tiempoSeleccionado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        opcionesTiempo.getItems().addAll(tiempo);
        opcionesLenguaje.getItems().addAll(lenguaje);

        juego = new Juego();

    }

    //este método evalua si se eligieron las opciones de todos los ChoiceBox, retorna true si se eligieron todas, retorna false en caso contrario
    private boolean choiceBoxCompletos() {
        return opcionesTiempo.getSelectionModel().getSelectedItem() != null
                && opcionesLenguaje.getSelectionModel().getSelectedItem() != null;
    }

    @FXML
    private void empezarJuego(ActionEvent event) throws IOException {

        if (choiceBoxCompletos()) {
            lenguajeSeleccionado = opcionesLenguaje.getValue();
            tiempoSeleccionado = opcionesTiempo.getValue();

            juego.setDuracion(Integer.parseInt(tiempoSeleccionado.split(" ")[0])); // Extraer el número de minutos

            juego.setLenguaje(lenguajeSeleccionado);

            generadorDePalabras = new GeneradorDePalabras(lenguajeSeleccionado);

            mostrarPalabra = new MostrarPalabra(generadorDePalabras.getNextWord());
            
                    tiempoRestante = juego.getDuracion() * 60; // Convertir minutos a segundos
        actualizarTemporizador();

      

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText("Faltan opciones por seleccionar");
            alert.setContentText("Por favor, selecciona todas las opciones dadas");
            alert.showAndWait();
        }
    }
    
   
}



