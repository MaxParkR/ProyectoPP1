/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controlador;



import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Mateo
 * Esta es la clese del juego principal que ejecuta los métodos establecidos en MostrarPalabra y SeleccinadorDePalabras 
 * para la correcta visualización de las mismas en una ventana con imagen de fondo
 */
public class Juego {
    
    private SeleccionadorDePalabras selector = new SeleccionadorDePalabras();
    
    StackPane root = new StackPane();
    
    /* Se crea un instancia de la clase Juego en la que se define el tamaño de la ventana, se carga la imagen de fondo
    y se muestran las palabras sobre esa imagen
    */
    
    public Juego(){  
        
        root.setPrefSize(800, 600);
        
         // Cargar la imagen de fondo
        Image backgroundImage = new Image("/Imagenes/d88evxn-220cb0a2-1322-438f-9623-932d9a3bbeb5.jpg");
        ImageView backgroundImageView = new ImageView(backgroundImage);

        // Establecer las medidas de la imagen para que se ajusten a la ventana, es decir sea un proceso "responsive"
        backgroundImageView.fitWidthProperty().bind(root.widthProperty());
        backgroundImageView.fitHeightProperty().bind(root.heightProperty());

        // Agregar la imagen en fondo del StackPane
        root.getChildren().add(backgroundImageView);
        
        //se invoca el método que muestra las palabras
        mostrarSiguientePalabra();
        
        Button botonCerrar = new Button("Cerrar");
        botonCerrar.setOnAction(event -> {
            // Cerrar la ventana del juego23
            ((Stage) root.getScene().getWindow()).close();
        });
        StackPane.setAlignment(botonCerrar, Pos.BOTTOM_CENTER);
        root.getChildren().add(botonCerrar);
               
    }
    
    /**
     * Obtiene el StackPane principal de la ventana del juego.
     * 
     * @return El StackPane que representa la ventana del juego.
     */
     public StackPane getRoot() {
        return root;
     }
    
     
    private void mostrarSiguientePalabra(){
        String word = selector.getSiguientePalabra();
        
        MostrarPalabra view = new MostrarPalabra(word);
        
        //agrega la palabra al StackPane en la posición 1, esto se hace para que se muestre encima de la imagen de fondo
        root.getChildren().add(1,view);
    }
    
    /**
     * Maneja el evento de presionar una tecla en el juego.
     * Verifica si la letra presionada es correcta y muestra la siguiente palabra si la actual ha sido completada.
     * 
     * @param letter La letra presionada por el usuario.
     */
    
    
    void onKeyPress(String letra){
        MostrarPalabra view = (MostrarPalabra) root.getChildren().get(1);
        view.handleKeyPress(letra);
        
        /*evalua si se termino de escribir la palabra completamente, si es cierto, se ejecuta el método 
          mostrarSiguientePalabra y así sucesivamente  
        */
        if(view.palabraCompleta()){
            mostrarSiguientePalabra();
        }
    }
}
    
    

