package d_arrays_e_collections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> pilhaDeLivros = new ArrayDeque<>();

        pilhaDeLivros.add("O Pequeno Príncipe");
        pilhaDeLivros.push("Don Quixote");
        pilhaDeLivros.push("O Hobbit");

        System.out.println(pilhaDeLivros.peek()); // Retorna o último elemento da pilha (conceito de LIFO)
        System.out.println(pilhaDeLivros.peek()); // Retorna o último elemento da pilha (conceito de LIFO)

        pilhaDeLivros.isEmpty();
    }
}
