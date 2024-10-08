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

        Terminal.ligas.add(liga);
    }

    public static void crearEquipo() {
        Liga liga = pedirLiga();
        Equipo equipo = pedirEquipo();
        int ligaPos = Terminal.buscarLiga(liga);

        if (ligaPos > -1) {
            Terminal.ligas.get(ligaPos).insertarEquipo(equipo);
        }
    }

    public static void crearEntrenador() {
        int ligaPos;
        int equipoPos;

        Liga liga = pedirLiga();
        Equipo equipo = pedirEquipo();
        Entrenador entrenador = pedirEntrenador();

        ligaPos = Terminal.buscarLiga(liga);
        if (ligaPos > -1) {
            equipoPos = Terminal.ligas.get(ligaPos).buscarEquipo(equipo);
            if (equipoPos > -1) {
                Terminal.ligas.get(ligaPos).getEquipo(equipoPos).setEntrenador(entrenador);
            }
        }
    }

    public static void crearJugador() {
        int ligaPos;
        int equipoPos;

        Liga liga = pedirLiga();
        Equipo equipo = pedirEquipo();
        Jugador jugador = pedirJugador();

        ligaPos = Terminal.buscarLiga(liga);
        equipoPos = Terminal.ligas.get(ligaPos).buscarEquipo(equipo);

        Terminal.ligas.get(ligaPos).getEquipo(equipoPos).añadirJugador(jugador);
    }
}
