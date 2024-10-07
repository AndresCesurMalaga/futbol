package vista;

import modelo.*;
import static vista.Pedir.*;

public class Crear {

    public static void preguntarCrear() {

        int leido = 0;
        boolean salir = false;

        crearDescripcion();// muestra el menu

        do {
            leido = Terminal.lector.nextInt();
            Terminal.lector.nextLine();

        if (leido == 1) {
            crearLiga();
        }

        if (leido == 2) {
            crearEquipo();
        }

        if (leido == 3) {
            crearJugador();
        }

        if (leido == 4) {
            crearEntrenador();
        }

        if (leido == 5) {
            salir = true;
        }

    } while ((leido > 5 || leido < 1) && !salir);


    }

    public static void crearDescripcion() {
        System.out.println("Menu para crear");
        System.out.println("Escriba [1] para crear liga");
        System.out.println("Escriba [2] para crear equipo");
        System.out.println("Escriba [3] para crear jugador");
        System.out.println("Escriba [4] para crear entrenador");
        System.out.println("Escriba [5] para volver");
    }

    public static void crearLiga() {
        Liga liga = pedirLiga();
    }

    public static void crearEquipo() {
        Equipo equipo = pedirEquipo();
    }

    public static void crearEntrenador() {
        Entrenador entrenador = pedirEntrenador();
    }

    public static void crearJugador() {
        Jugador jugador = jugador = pedirJugador();
    }
}
