package vista;

import modelo.Entrenador;
import modelo.Equipo;
import modelo.Jugador;
import modelo.Liga;
import static vista.Pedir.*;

public class Eliminar {

    public static void preguntarEliminar() {

        int leido = 0;
        boolean salir = false;

        eliminarDescripcion();// muestra el menu

        do {
            leido = Terminal.lector.nextInt();
            Terminal.lector.nextLine();

            if (leido == 1) {
                eliminarLiga();
            }

            if (leido == 2) {
                eliminarEquipo();
            }

            if (leido == 3) {
                eliminarJugador();
            }

            if (leido == 4) {
                eliminarEntrenador();
            }

            if (leido == 5) {
                salir = true;
            }

        } while ((leido > 5 || leido < 1) && !salir);

    }

    public static void eliminarDescripcion() {
        System.out.println("Menu para crear");
        System.out.println("Escriba [1] para elimninar liga");
        System.out.println("Escriba [2] para eliminar equipo");
        System.out.println("Escriba [3] para eliminar jugador");
        System.out.println("Escriba [4] para eliminar entrenador");
        System.out.println("Escriba [5] para volver");
    }

    public static void eliminarLiga() {
        Liga liga = pedirLiga();
    }

    public static void eliminarEquipo() {
        Equipo equipo = pedirEquipo();
    }

    public static void eliminarEntrenador() {
        Entrenador entrenador = pedirEntrenador();
    }

    public static void eliminarJugador() {
        Jugador jugador = jugador = pedirJugador();
    }
}
