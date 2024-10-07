package modelo;

public class Util {

    // IMPORTANTE, Estos métodos utilizarán "public boolean equals(TuObjeto
    // tuObjeto)"
    // Si no esta implementado en tu clase para realizar las comparaciones puede
    // tener un comportamiento que no es el esperado. Por tanto implementalo
    // Este método deverá devolver TRUE cuando tu consideres que dos objetos de tu
    // clase sean iguales, y falso en caso contrario

    // Este es un método genérico que busca un objeto en una lista de objetos
    // nElements debe ser el numero total de elementos que hay en al lista
    // NO comprueba que el tipo que pasas es el adecuado para ese array

    // Este método recorrera el array comparando el objeto de cada posición con
    // el que le pases por parámetro haciendo uso del equals que hayas implementado
    //
    // Devolverá un número >=0 indicando la posicion del array en la que se
    // encuentra
    // Devolverá -1 si no lo encontró

    public static int search(Object object, Object[] objects, int nElements) {
        int cont = 0;
        int found = -1;

        while ((found == -1) && (cont < nElements)) {

            if (objects[cont].equals(object)) {
                found = 1;

            } else {
                cont++;
            }
        }

        if (found == -1) {
            cont = -1;
        }

        return cont;
    }

    // Este es un método genérico que añade un objeto a un array de objects
    // Lo añade en la última posicion que tenga libre
    // nElements debe ser el numero total de elementos que hay en al lista
    // NO comprueba que el tipo que pasas puede ser guardado en ese array

    public static boolean add(Object object, Object[] objects, int nElements) {
        int position = 0;

        position = search(object, objects, nElements);

        if (position != -1) {
            objects[nElements] = object;

        } else {
            return false;
        }

        return true;
    }

    // Este es un método genérico que elimina un objeto de un array de objects
    // nElements debe ser el numero total de elementos que hay en al lista
    // NO comprueba que el tipo que pasas puede ser guardado en ese array

    public static boolean eliminate(Object object, Object[] objects, int nElements) {
        int position = 0;

        position = search(object, objects, nElements);

        if (position != -1) {
            for (; position < nElements - 1; position++) {
                objects[position] = objects[position + 1];
            }

            objects[nElements - 1] = null;

        } else {
            return false;
        }

        return true;
    }

}
