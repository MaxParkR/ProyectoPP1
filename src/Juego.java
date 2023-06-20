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
    private Jugador[] jugadores;
    
    public Juego(){
        duracion = 0;
        jugadores = new Jugador[0];
        
    }
    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    public void addJugador(Jugador jugador){
        Jugador[] actualizarJugadores = new Jugador[jugadores.length + 1];
        System.arraycopy(jugadores, 0, actualizarJugadores, 0, jugadores.length);
        actualizarJugadores[jugadores.length] = jugador;
        jugadores = actualizarJugadores;
    }
    
    public void iniciarJuego(){
        //Lógica para iniciar el juego
        
    }
    
    public void terminarJuego(){
        //Lógica para terminar el juego
    }
    
    
    
}
