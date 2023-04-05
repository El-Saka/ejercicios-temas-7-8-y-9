// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
// Elimina el 2o y 3er elemento y muestra el resultado final.

import java.util.Arrays;

public class Vector {
    public static void main(String[] args) {

        // Crea un "Vector" del tipo entero
        int[] vector = new int[5];

        // Agrega elementos al vector
        vector[0] = 10;
        vector[1] = 20;
        vector[2] = 30;
        vector[3] = 40;
        vector[4] = 50;

        // Mostrar el vector original.
        System.out.println("Vector original: " + Arrays.toString(vector));

        //Elimina el 2do y 3er elemento.
        for (int i = 1; i <3 ; i++) {
            vector[i] = 0;
        }

        // Mostrar el resultado del vector.
        System.out.println("Vector resultado: " + Arrays.toString(vector));



    }
}
