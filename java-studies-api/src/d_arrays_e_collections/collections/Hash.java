package d_arrays_e_collections.collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Ronaldinho"));
        usuarios.add(new Usuario("Pelé"));
        usuarios.add(new Usuario("Neymar"));

        boolean resultado = usuarios.contains(new Usuario("Pelé"));
        System.out.println(resultado);
    }
}
