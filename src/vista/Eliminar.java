package vista;

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

    public static boolean eliminarLiga() {
        Liga liga = pedirLiga();

        return Terminal.ligas.remove(liga);
    }

    public static boolean eliminarEquipo() {
        Equipo equipo = pedirEquipo();
        int pos = 0;
        int cont = 0;
        boolean found = false;

        while ((cont < Terminal.ligas.size()) && (!found)) {
            found = Terminal.ligas.get(cont).eliminarEquipo(equipo);

            if (pos != -1) {
                found = true;
            } else {
                cont++;
            }
        }

        return found;
    }

    public static void eliminarEntrenador() {
        int pos = 0;
        int cont = 0;
        int cont2 = 0;
        boolean found = false;
        int dni;

        System.out.println("Introduce el DNI (Sin letra)");
        dni = Terminal.lector.nextInt();
        Terminal.lector.nextLine();

        while ((cont < Terminal.ligas.size()) && (!found)) {

            cont2 = 0;

            while ((cont2 < (Terminal.ligas.get(cont).getEquipos().size())) && (!found)) {
                if (Terminal.ligas.get(cont).getEquipos().get(cont2).getEntrenador().getDNI() == dni) {
                    found = true;
                    Terminal.ligas.get(cont).getEquipos().get(cont2).eliminarEntrenador();
                }

                if (pos != -1) {
                    found = true;
                } else {
                    cont2++;
                }
            }
            cont++;
        }
    }

    public static void eliminarJugador() {
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

                if ((pos > -1) && (Terminal.ligas.get(cont).getEquipos().get(cont2).getJugador(pos).getDNI() == dni)) {
                    found = true;
                    Terminal.ligas.get(cont).getEquipos().get(cont2).eliminarJugador(pos);

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

    }
}
