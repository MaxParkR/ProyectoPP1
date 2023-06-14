/**
 *
 * @author Mateo
 */

public class Jugador {
    
    
    private String nombre;
    private String lenguaje;
    private int puntuacion;
    
    public Jugador(String nombre, String lenguaje) {
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        this.puntuacion = 0;
    }
    
    // Getters and setters
    public String getNombre() {
        return nombre;
    }
    
    public String getLenguaje() {
        return lenguaje;
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }
    
    public void setScorePuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    // Incrementa el puntaje del jugador
    public void incrementarPuntaje() {
        puntuacion++;
    }
}

    

