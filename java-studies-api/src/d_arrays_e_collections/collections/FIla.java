package d_arrays_e_collections.collections;

import java.util.LinkedList;
import java.util.Queue;

public class FIla {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Igor");
        fila.offer("Ana");
        fila.add("Carlos");
        fila.offer("Rafaela");

        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());
    }
}
