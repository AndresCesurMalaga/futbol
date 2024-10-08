package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Liga;

public class Terminal {

    protected static ArrayList<Liga> ligas = new ArrayList<>();

    protected static Scanner lector = new Scanner(System.in);

    public static void preguntar() {// pregunto por pantalla que hago
        int leido;

        do {
            preguntarDescripcion();// muestra el menu

            leido = 0;

            do {
                leido = lector.nextInt();
                lector.nextLine();
            } while (leido > 4 || leido < 1);

            if (leido == 1) {
                vista.Crear.preguntarCrear();// pregunto que quiero crear
            }

            if (leido == 2) {
                vista.Mostrar.preguntarMostrar();// pregunto que quiero eliminar
            }

            if (leido == 3) {
                vista.Eliminar.preguntarEliminar();// pregunto que quiero mostar
            }

        } while (leido != 4);

    }

    public static void preguntarDescripcion() {
        System.out.println("Menu principal de elección");
        System.out.println("Escriba [1] para crear");
        System.out.println("Escriba [2] para mostrar");
        System.out.println("Escriba [3] para eliminar");
        System.out.println("Escriba [4] para finalizar el programa");
    }

    public static void cargarDatos() {

    }

    public static void guardarDatos() {

    }

    public static int buscarLiga(Liga liga) {
        int cont = 0;
        while (cont<ligas.size()) {
            if (ligas.get(cont).equals(liga)) {
                return cont;

            } else {
                cont++;
            }
        }
        return -1;
    }

}