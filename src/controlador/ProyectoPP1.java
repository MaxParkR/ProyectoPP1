/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.HashSet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author Mateo
 */
public class ProyectoPP1 extends Application {
    
    @Override
    //Metodo abstracto al que se le agrega el escenario principal
    public void start(Stage primaryStage) throws IOException {
    
        Parent raiz = FXMLLoader.load(getClass().getResource("/vista/Vista1.fxml"));
        
        Scene scene = new Scene(raiz);
       
        primaryStage.setScene(scene);
        
        primaryStage.show();
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //el Launch permite llamar al método Start
        launch(args);
    }
    
}
