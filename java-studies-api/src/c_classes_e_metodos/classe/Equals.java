package c_classes_e_metodos.classe;

public class Equals {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.name = "Pipor Augusto";
        u1.email = "pipor@email.com";

        Usuario u2 = new Usuario();
        u2.name = "Pipor Augusto";
        u2.email = "pipor@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
