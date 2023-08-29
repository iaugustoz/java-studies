package fundamentos.operadores;

public class DesafioLogico {

    public static void main(String[] args) {

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

        if (trabalhoTerca && trabalhoQuinta) {
            System.out.println("SMART TV 50\" COMPRADA E SORVETE GARANTIDO");

        } else if (trabalhoTerca ^ trabalhoQuinta) {
            System.out.println("SMART TV 32\" COMPRADA E SORVETE GARANTIDO");

        } else {
            System.out.println("SEM TV E SEM SORVETE");
        }
    }
}
