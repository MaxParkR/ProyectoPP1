package modelo;


import modelo.Jugador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateo
 */
public class Juego {
    
    private int duracion;
    private int cantidadDeJugadores;
    private String lenguaje;
    
//    public Juego(){
//        duracion = 0;
//        jugadores = new Jugador[0];
//        
//    }
    
    
    
//    public void setDuracion(int duracion){
//        this.duracion = duracion;
//    }
//    
//    public void addJugador(Jugador jugador){
//        Jugador[] actualizarJugadores = new Jugador[jugadores.length + 1];
//        System.arraycopy(jugadores, 0, actualizarJugadores, 0, jugadores.length);
//        actualizarJugadores[jugadores.length] = jugador;
//        jugadores = actualizarJugadores;
//    }
    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    public void setCantidadDeJugadores(int cantidadDeJugadores){
        this.cantidadDeJugadores = cantidadDeJugadores;
    }
    
    public void setLenguaje(String lenguaje){
        this.lenguaje = lenguaje;
    }
    
    
    
    public void iniciarJuego(){
        //Lógica para iniciar el juego
        
        
    }
    
    public void terminarJuego(){
        //Lógica para terminar el juego
    }
    
    
    
}
