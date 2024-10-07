package modelo;

public class Jugador extends Persona {

    private int juego;

    public Jugador(String nombre, int juego, int dni) {
        super(nombre, dni);
        this.juego = juego;
    }

    public int getJuego() {
        return this.juego;
    }

    public void setJuego(int juego) {
        this.juego = juego;
    }

}