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
 * 
 * Esta clase contiene el método cargarEscena el cual se encarga de cargar la escena que se tiene en un
 * archivo .fxml y establecerla en la raíz ( root)
 * 
 */
public class AbrirVentana {
    
    public static void cargarEscena(String url, Event event) throws IOException {

        //esta linea de código es la que ocula la ventana que se está viendo en pantalla
        ((Node) (event.getSource())).getScene().getWindow().hide();
        
        //Nos permite cargar la escena desde la URL 
        Parent root = FXMLLoader.load(AbrirVentana.class.getResource(url));
        Scene scene = new Scene(root);
        
        //Crea una nueva ventana y se establece la nueva escena para mostrarla
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();

    }
    
}