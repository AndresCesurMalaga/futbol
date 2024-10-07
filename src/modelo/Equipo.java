package modelo;

public class Equipo {

    private static int sigCodEquipo = 0;

    private static final int MAX_JUGADORES = 20;
    private final int COD_EQUIPO;
    private String nombre;
    private int numJugadores;

    private Jugador[] jugadores;
    // se inserta jugador en el primer hueco vacío (null)
    // cuando se elimina jugador se desplazan los jugadores a su derecha
    // un hueco a la izquierda.
    private Entrenador entrenador;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.COD_EQUIPO = sigCodEquipo;
        sigCodEquipo++;
        this.jugadores = new Jugador[MAX_JUGADORES];
        this.numJugadores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCOD_EQUIPO() {
        return COD_EQUIPO;
    }

    public static int getSigCodEquipo() {
        return sigCodEquipo;
    }

    public Jugador[] getJugadores() {
        return this.jugadores;
    }

    public int getNumJugadores() {
        return this.numJugadores;
    }

    public Jugador getJugador(int pos) {
        if (pos < this.numJugadores) {
            return jugadores[pos];

        } else {
            return null;
        }
    }

    public Entrenador getEntrenador() {
        return this.entrenador;
    }

    public boolean setEntrenador(Entrenador entrenador) {
        if (this.entrenador != null) {
            return false;

        }
        this.entrenador = entrenador;
        return true;
    }

    public boolean eliminarEntrenador(Entrenador entrenador) {
        if (this.entrenador == null) {
            return false;

        } else {

            this.entrenador = null;
            return true;
        }

    }

    public int buscarJugador(Jugador jugador) {
        return Util.search(jugador, jugadores, numJugadores);
    }

    public boolean añadirJugador(Jugador jugador) {

        if (Util.add(jugador, jugadores, numJugadores)) {
            numJugadores++;
            return true;

        } else {
            return false;
        }
    }

    public boolean eliminarJugador(Jugador jugador) {

        if (Util.eliminate(jugador, jugadores, numJugadores)) {
            numJugadores--;
            return true;

        } else {
            return false;
        }
    }

    // Permite comparar dos objetos de tipo Equipo
    public boolean equals(Equipo equipo) {
        return (this.nombre.equals(equipo.nombre));
    }

}
