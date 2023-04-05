// Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre
// ambos mostrando únicamente el valor de cada elemento.


import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_de_tipo_String {
    public static void main(String[] args) {

        // Crear el ArrayList con 4 elementos.
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        // Copiar el ArrayList en una linkedList.
        LinkedList<String> linkedList = new LinkedList<String>(arrayList);

        // Recorrer ambos y mostrar sus valores.
        System.out.println("Valores del ArrayList: ");
        for (String elemento : arrayList){
            System.out.println(elemento);
        }

        System.out.println("Valores de la LinkedList:");
        for (String elemento : linkedList){
            System.out.println(elemento);
        }
    }
}
