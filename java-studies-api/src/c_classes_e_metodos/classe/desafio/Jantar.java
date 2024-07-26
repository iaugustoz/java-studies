package c_classes_e_metodos.classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Baião de Dois", 0.500);
        Pessoa p1 = new Pessoa("Igor", 75.0);

        p1.comer(c1);
        p1.apresentar();
    }
}
