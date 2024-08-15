package d_arrays_e_collections.collections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Beltinho"));
        lista.add(new Usuario("Iguinho"));

        System.out.println("\nNome retornado por método: " + lista.get(1).getNome());

        for (Usuario usuario: lista) {
            System.out.println(usuario.getNome());
        }
    }
}
