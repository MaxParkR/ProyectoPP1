/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import static controlador.AbrirVentana.cargarEscena;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import modelo.GeneradorDePalabras;
import modelo.Juego;

/**
 * FXML Controller class
 *
 * @author Mateo
 */
public class VistaNewGameOptionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private ChoiceBox<String> opcionesJugadores;

    @FXML
    private ChoiceBox<String> opcionesTiempo;

    @FXML
    private ChoiceBox<String> opcionesLenguaje;

    @FXML
    private Button btnStart;

    private final String[] jugadores = {"2 Jugadores", "3 jugadores", "4 jugadores"};

    private final String[] tiempo = {"1 minuto", "2 minutos", "3 minutos", "4 minutos"};

    private final String[] lenguaje = {"Español", "Inglés"};

    String jugadorSeleccionado;
    String tiempoSeleccionado;
    String lenguajeSeleccionado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        opcionesJugadores.getItems().addAll(jugadores);
        opcionesTiempo.getItems().addAll(tiempo);
        opcionesLenguaje.getItems().addAll(lenguaje);

    }

    //este método evalua si se eligieron las opciones de todos los ChoiceBox, retorna true si se eligieron todas, retorna false en caso contrario
    private boolean choiceBoxCompletos() {
        return opcionesJugadores.getSelectionModel().getSelectedItem() != null
                && opcionesTiempo.getSelectionModel().getSelectedItem() != null
                && opcionesLenguaje.getSelectionModel().getSelectedItem() != null;
    }

    @FXML
    private void empezarJuego(ActionEvent event) throws IOException {

        if (choiceBoxCompletos()) {
            jugadorSeleccionado = opcionesJugadores.getValue();
            tiempoSeleccionado = opcionesTiempo.getValue();
            lenguajeSeleccionado = opcionesLenguaje.getValue();

            Juego juego = new Juego();
            GeneradorDePalabras generadorDePalabras = new GeneradorDePalabras(opcionesLenguaje.getValue());

            juego.setDuracion(Integer.parseInt(tiempoSeleccionado.split(" ")[0])); // Extraer el número de minutos
            juego.setCantidadDeJugadores(Integer.parseInt(jugadorSeleccionado.split(" ")[0])); // Extraer el número de jugadores
            juego.setLenguaje(lenguajeSeleccionado);

            cargarEscena("/vista/VistaJuego.fxml", event);
           

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText("Faltan opciones por seleccionar");
            alert.setContentText("Por favor, selecciona todas las opciones dadas");
            alert.showAndWait();
        }

    }

}
