/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Mateo
 */
public class MostrarPalabra extends HBox { 
    
    public char[] letras;
    private int letrasCorrectas = 0;
    
    
    public MostrarPalabra(String word){
        letras = word.toUpperCase().toCharArray();
        
        for(char c : letras){
            Text letra = new Text(c + "");
            letra.setFont(Font.font(40) );
            
            getChildren().add(letra);
        }
        
        setAlignment(Pos.CENTER);
    } 
    
    public void handleKeyPress(String letra){
        if(isFinished())
            return;
        
        char c = letras[letrasCorrectas];
        
        if (letra.charAt(0) == c) {
            getChildren().get(letrasCorrectas).setVisible(false);
            letrasCorrectas++;
        } else {
            //tecleo la tecla incorrecta
        }
        
        
        
    }
    
    public boolean isFinished(){
        return letrasCorrectas == letras.length;
        
    }
}
