package d_arrays_e_collections.collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucca");
        listaAprovados.add("Pedro");
        listaAprovados.add("Igor");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new TreeSet<>();

        nums.add(1);
        nums.add(23);
        nums.add(244);
        nums.add(6);
        nums.add(12);

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
