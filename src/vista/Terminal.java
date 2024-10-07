package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Liga;


public class Terminal {

    private static ArrayList<Liga> Ligas;

    protected static Scanner lector = new Scanner(System.in);

    public void preguntar() {// pregunto por pantalla que hago
        int leido = 0;

        preguntarDescripcion();// muestra el menu

        do {
            leido = lector.nextInt();
            lector.nextLine();
        } while (leido > 3 || leido < 1);

        if (leido == 1) {
            vista.Crear.preguntarCrear();// pregunto que quiero crear
        }

        if (leido == 2) {
            vista.Eliminar.preguntarEliminar();// pregunto que quiero mostar
        }

        if (leido == 3) {
            vista.Mostrar.preguntarMostrar();// pregunto que quiero eliminar
        }

    }

    public static void preguntarDescripcion() {
        System.out.println("Menu principal de elección");
        System.out.println("Escriba [1] para crear");
        System.out.println("Escriba [2] para mostrar");
        System.out.println("Escriba [3] para eliminar");
    }

}