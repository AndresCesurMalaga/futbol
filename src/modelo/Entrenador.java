package modelo;

public class Entrenador extends Persona {

    private int tactica;

    public Entrenador(String nombre, int tactica, int dni) {
        super(nombre, dni);
        this.tactica = tactica;
    }

    public int getTactica() {
        return this.tactica;
    }

    public void setTactica(int tactica) {
        this.tactica = tactica;
    }
}
