/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author Mateo
 * Esta clase es la que permite mostrar las palabras en el juego.
 * Hereda los componentes de la clase HBox de Javafx que nos permite mostrar las palabras horizontalmente
 * 
 */
public class MostrarPalabra extends HBox { 
    
    public char[] letras;
    private int letrasCorrectas = 0;
    
    
    /**
     * Crea una instancia de la clase MostrarPalabra.
     * Carga la palabra dada y la muestra como una secuencia de letras en una fila horizontal.
     * 
     * @param palabra es la palabra que se va a mostrar.
     */
    public MostrarPalabra(String palabra){
        letras = palabra.toUpperCase().toCharArray();
        
        for(char c : letras){
            Text letra = new Text(c + "");
            letra.setFill(Color.WHITE);
            Font customFont = Font.font("Goudy Old Style", FontWeight.BOLD, 70);
            letra.setFont(customFont);
            
      
            
            
            getChildren().add(letra);
        }
        
        setAlignment(Pos.CENTER);
    } 
    
     /**
     * Maneja el evento de presionar una tecla.
     * Verifica si la letra presionada es correcta y actualiza la visualización de la palabra.
     * 
     * @param letra La letra presionada por el jugador.
     */
    
    public void handleKeyPress(String letra){
        if(palabraCompleta())
            return;
        
        char c = letras[letrasCorrectas];
        
        if (letra.charAt(0) == c) {
            getChildren().get(letrasCorrectas).setVisible(false);
            letrasCorrectas++;
        } else {
            
        }
        
        
        
    }
    
    /**
     * Verifica si la palabra ha sido completada.
     * 
     * @return true si todas las letras de la palabra han sido correctamente escritas, false de lo contrario
     */
    
    public boolean palabraCompleta(){
        return letrasCorrectas == letras.length;
        
    }
}
