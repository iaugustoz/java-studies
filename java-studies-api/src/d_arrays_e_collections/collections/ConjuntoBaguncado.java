package d_arrays_e_collections.collections;

import java.util.HashSet;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet set = new HashSet();

        // Implicitamente o set realiza a conversão dos tipos para seus respectivos wrappers
        set.add(1.2); // double -> Double
        set.add(true); // boolean -> Boolean
        set.add("Teste");
        set.add(1); // int -> Integer
        set.add('x'); // char -> Caracter

        // Retorna o tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + set.size());

        // Remove o elemento especificado do conjunto
        set.remove(1.2);
        System.out.println("Tamanho do conjunto com o elemento removido: " + set.size());

        // Retorna se o elemento está presente ou não no conjunto
        set.contains(true);
        set.contains(90);
        System.out.println("Contém? " + set.contains("opa"));
    }
}
