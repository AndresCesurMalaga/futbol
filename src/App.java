import modelo.Entrenador;
import modelo.Jugador;

public class App {
    public static void main(String[] args) {
        Jugador santiago = new Jugador("Santiago", 4, 1);
        Jugador fran = new Jugador("Fran", 5, 2);
        Entrenador andres = new Entrenador("Andrés", 6, 3);

        System.out.print("El jugador ");
        System.out.print("[" + santiago.getNombre() + "]");
        System.out.println(" tiene el DNI: " + santiago.getDNI());

        System.out.print("\nEl jugador ");
        System.out.print("[" + fran.getNombre() + "]");
        System.out.println(" tiene el DNI: " + fran.getDNI());

        System.out.print("\nEl entrenador ");
        System.out.print("[" + andres.getNombre() + "]");
        System.out.println(" tiene el DNI: " + andres.getDNI());
    }
}
