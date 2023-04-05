// Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
// A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último,
// vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en
// menos pasos, siempre y cuando cumplas el primer "for" de relleno.

import java.util.ArrayList;

public class ArrayList_de_tipo_int {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Rellenamos el ArrayList con elementos del 1  al 10.
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Eliminar los números pares.
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) %2 == 0) {
                numbers.remove(i);
                i--; // Volvemos a verificar la misma posición despues de eliminar.
            }
        }

        // Mostrar el ArrayList final.
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
