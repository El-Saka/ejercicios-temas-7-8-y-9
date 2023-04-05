// Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
// "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado
// en el parámetro "fileIn" al fichero dado en "fileOut".

import java.io.*;

public class InputStream_y_PrintStream {
    public static void copy(String fileIn, String fileOut) throws IOException {
        FileInputStream inputStream = null;
        PrintStream outputStream = null;

        try {
            // Abre el archivo de entrada
            inputStream = new FileInputStream(fileIn);

            // Abre el archivo de salida
            outputStream = new PrintStream(new FileOutputStream(fileOut));

            // Copia los bytes del archivo de entrada al archivo de salida
            int bytesRead;
            byte[] buffer = new byte[4096];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

        } finally {
            // Cierra los streams de entrada y salida
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
