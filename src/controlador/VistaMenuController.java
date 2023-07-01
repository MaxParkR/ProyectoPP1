package controlador;


import static controlador.AbrirVentana.cargarEscena;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mateo
 */
public class VistaMenuController implements Initializable {

    @FXML
    private Button btnNewGame;
    @FXML
    private Button btnOptions;
    @FXML
    private Button btnExit;

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void eventAction(ActionEvent event) throws IOException {
    
    Object evt = event.getSource();
    
    if (evt.equals(btnNewGame)){
        cargarEscena("/vista/VistaJuego2.fxml", event);
    }
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
  
}
