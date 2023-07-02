package controlador;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
    private Button btnExit;
   
    private Juego juego;
    
    /**
     * Inicializa en controlador de la clase
     */
    
    /**
     * Maneja el evento de acción para los botones.
     * 
     * @param event El evento de acción.
     * @throws IOException Si ocurre un error al cargar la vista del juego.
     */
    
    
    @FXML
    private void eventAction(ActionEvent event) throws IOException {
    
    Object evt = event.getSource();
    
    if (evt.equals(btnNewGame)){
            juego = new Juego();
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(juego.getRoot());
            scene.setOnKeyPressed(e -> juego.onKeyPress(e.getCode().toString()));
            stage.setScene(scene);
            stage.show();
         
    } else if (evt.equals(btnExit)) {
            // Cerrar la ventana del juego
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
        }
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
  
}
