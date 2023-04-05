// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

import com.sun.source.tree.TryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class creando_un_programa {

            public static void main(String[] args) {
                InputStream inputStream = System.in;
                PrintStream printStream = System.out;

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                Map<String, List<String>> mapa = new HashMap<>();

                try {
                    printStream.println("Ingrese una clave:");
                    String clave = bufferedReader.readLine();

                    printStream.println("Ingrese un valor para la clave (ingrese 'fin' para terminar):");
                    String valor = bufferedReader.readLine();

                    List<String> valores = new ArrayList<>();

                    while (!valor.equals("fin")) {
                        valores.add(valor);

                        printStream.println("Ingrese otro valor para la clave (ingrese 'fin' para terminar):");
                        valor = bufferedReader.readLine();
                    }

                    mapa.put(clave, valores);

                    printStream.println("El mapa es: " + mapa);
                } catch (IOException e) {
                    printStream.println("Error al leer entrada: " + e.getMessage());
                }

                List<String> lista = new LinkedList<>();

                try {
                    printStream.println("Ingrese elementos para la lista (ingrese 'fin' para terminar):");
                    String elemento = bufferedReader.readLine();

                    while (!elemento.equals("fin")) {
                        lista.add(elemento);

                        printStream.println("Ingrese otro elemento para la lista (ingrese 'fin' para terminar):");
                        elemento = bufferedReader.readLine();
                    }

                    printStream.println("La lista es: " + lista);
                } catch (IOException e) {
                    printStream.println("Error al leer entrada: " + e.getMessage());
                }
            }
        }


