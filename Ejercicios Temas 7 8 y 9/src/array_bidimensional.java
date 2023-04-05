
// Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
// el valor de cada elemento en ambas dimensiones.

public class array_bidimensional {
    public static void main(String[] args) {
        int[][] array_bidimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < array_bidimensional.length; i++) {
            for (int j = 0; j < array_bidimensional[i].length; j++){
                System.out.printf("Posición [%d][%d]: %d\n", i, j, array_bidimensional[i][j]);
            }

        }
    }
}
