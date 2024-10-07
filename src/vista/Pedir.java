package vista;

import modelo.*;

public class Pedir {

    public static Liga pedirLiga() {
        String nombre;
        int numEquipos;

        System.out.println("Introduce el nombre de la liga");
        nombre = Terminal.lector.nextLine();

        System.out.println("Introduce el maximo numero de equipos");
        numEquipos = Terminal.lector.nextInt();
        Terminal.lector.nextLine();

        return new Liga(nombre, numEquipos);
    }

    public static Equipo pedirEquipo() {
        String nombre;

        System.out.println("Introduce el nombre del equipo");
        nombre = Terminal.lector.nextLine();

        return new Equipo(nombre);
    }

    public static Jugador pedirJugador() {
        String nombre;
        int juego;
        int dni;

        System.out.println("Introduce el nombre del jugador");
        nombre = Terminal.lector.nextLine();

        System.out.println("Introduce el nivel de juego");
        juego = Terminal.lector.nextInt();
        Terminal.lector.nextLine();

        System.out.println("Introduce el dni");
        dni = Terminal.lector.nextInt();
        Terminal.lector.nextLine();

        return new Jugador(nombre, juego, dni);
    }

    public static Entrenador pedirEntrenador() {
        String nombre;
        int tactica;
        int dni;

        System.out.println("Introduce el nombre del jugador");
        nombre = Terminal.lector.nextLine();

        System.out.println("Introduce el nivel de tactica");
        tactica = Terminal.lector.nextInt();
        Terminal.lector.nextLine();

        System.out.println("Introduce el dni");
        dni = Terminal.lector.nextInt();
        Terminal.lector.nextLine();

        return new Entrenador(nombre, tactica, dni);
    }
}
