// Indica cuál es el problema de utilizar un Vector con la capacidad
// por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

import java.util.Vector;

public class problema_de_un_Vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();

        // Agregando 1000 elementos al vector
        for (int i = 0; i < 1000; i++) {
            vector.add(i);
        }
    }
}

