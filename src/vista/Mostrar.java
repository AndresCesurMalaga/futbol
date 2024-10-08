package vista;

import modelo.*;
import static vista.Pedir.*;

public class Mostrar {

    public static void preguntarMostrar() {

        int leido = 0;
        boolean salir = false;

        mostrarDescripcion();// muestra el menu

        do {
            leido = Terminal.lector.nextInt();
            Terminal.lector.nextLine();

            if (leido == 1) {
                mostrarLigas();
            }

            if (leido == 2) {
                mostrarLiga();
            }

            if (leido == 3) {
                mostrarEquipo();
            }

            if (leido == 4) {
                mostrarPersona();
            }

            if (leido == 5) {
                mostrarTodo();
            }

            if (leido == 6) {
                salir = true;
            }

        } while ((leido > 6 || leido < 1) && !salir);

    }

    public static void mostrarDescripcion() {
        System.out.println("Menu para mostrar");
        System.out.println("Escriba [1] para mostar ligas");
        System.out.println("Escriba [2] para mostrar liga");
        System.out.println("Escriba [3] para mostrar equipo");
        System.out.println("Escriba [4] para mostrar persona");
        System.out.println("Escriba [5] para mostrar todo");
        System.out.println("Escriba [6] para volver");
    }

    public static void mostrarLigas() {
        int cont = 0;

        while (cont < Terminal.ligas.size()) {
            System.out.println(Terminal.ligas.get(cont).getCOD_LIGA());
            System.out.println(Terminal.ligas.get(cont).getEquipos());
            System.out.println(Terminal.ligas.get(cont).getNombre());
            System.out.println(Terminal.ligas.get(cont).getNumEquipos());
            cont++;
        }

    }

    public static void mostrarLiga() {
        int pos;

        Liga liga = pedirLiga();
        pos = Terminal.ligas.indexOf(liga);

        System.out.println(Terminal.ligas.get(pos).getCOD_LIGA());
        System.out.println(Terminal.ligas.get(pos).getEquipos());
        System.out.println(Terminal.ligas.get(pos).getNombre());
        System.out.println(Terminal.ligas.get(pos).getNumEquipos());
    }

    public static void mostrarEquipo() {
        int pos = 0;
        int cont = 0;
        int contM = 0;
        boolean found = false;

        Equipo equipo = pedirEquipo();

        while ((cont < Terminal.ligas.size()) && (!found)) {
            pos = Terminal.ligas.get(cont).buscarEquipo(equipo);

            if (pos != -1) {
                found = true;
            } else {
                cont++;
            }
        }

        if (found) {
            System.out.println(Terminal.ligas.get(cont).getEquipo(pos).getEntrenador());

            while (contM < Terminal.ligas.get(cont).getEquipo(pos).getNumJugadores()) {

                System.out.println(Terminal.ligas.get(cont).getEquipo(pos).getJugador(contM));

                contM++;
            }

            System.out.println(Terminal.ligas.get(cont).getEquipo(pos).getNombre());
            System.out.println(Terminal.ligas.get(cont).getEquipo(pos).getCOD_EQUIPO());

        } else {
            System.out.println("No encontrado");
        }

    }

    public static void mostrarPersona() {
        int pos = 0;
        int cont = 0;
        int cont2 = 0;
        boolean found = false;
        int dni;

        System.out.println("Introduce el DNI (Sin letra)");
        dni = Terminal.lector.nextInt();
        Terminal.lector.nextLine();
        Jugador jugador = new Jugador("temp", 0, dni);

        while ((cont < Terminal.ligas.size()) && (!found)) {

            cont2 = 0;

            while ((cont2 < (Terminal.ligas.get(cont).getEquipos().size())) && (!found)) {
                pos = Terminal.ligas.get(cont).getEquipos().get(cont2).buscarJugador(jugador);

                if (pos>-1 && (Terminal.ligas.get(cont).getEquipos().get(cont2).getJugador(pos).getDNI() == jugador.getDNI())) {
                    found = true;
                } else {
                    cont2++;
                }

            }

            if (pos != -1) {
                found = true;
            } else {
                cont++;
            }
        }

        if (found) {
            System.out.println(Terminal.ligas.get(cont).getEquipos().get(cont2).getNombre());
            System.out.println(Terminal.ligas.get(cont).getEquipos().get(cont2).getJugador(pos).getNombre());
            System.out.println(Terminal.ligas.get(cont).getEquipos().get(cont2).getJugador(pos).getDNI());

        } else {
            System.out.println("No encontrado");
        }

    }

    public static void mostrarTodo() {
        //sin implementar
    }

}
