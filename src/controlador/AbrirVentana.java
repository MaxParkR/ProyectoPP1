package controlador;


import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateo
 */
public class AbrirVentana {
    
    public static void cargarEscena(String url, Event event) throws IOException {

        ((Node) (event.getSource())).getScene().getWindow().hide();

        Parent root = FXMLLoader.load(AbrirVentana.class.getResource(url));
        Scene scene = new Scene(root);
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();

    }
    
}
