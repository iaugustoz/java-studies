package d_arrays_e_collections.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto Conceição");
        usuarios.put(2, "Igor Augusto");
        usuarios.put(3, "Avelino Augusto");
        usuarios.put(4, "Kátia Katchaça");
        usuarios.put(5, "Renata, a Ingrata");

        System.out.println("Tamanho: " + usuarios.size());
        System.out.println("Keys: \nValues: " + usuarios.keySet() + usuarios.values());
        System.out.println("Keys and Values: " + usuarios.entrySet());

        for (Integer key: usuarios.keySet()) {
            System.out.println("Keys: " + key);
        }

        for (String values: usuarios.values()) {
            System.out.println("Values: " + values);
        }

        for (Map.Entry<Integer, String> keyValues: usuarios.entrySet()) {
            System.out.println("Keys and Values: " + keyValues);
        }
    }
}
