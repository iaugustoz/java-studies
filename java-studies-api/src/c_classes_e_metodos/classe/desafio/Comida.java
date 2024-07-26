package c_classes_e_metodos.classe.desafio;

public class Comida {

    private String nome;

    private double peso;

    Comida(String nomeComida, double pesoComida) {
        this.nome = nomeComida;
        this.peso = pesoComida;
    }

    public String getNomeComida() {
        return nome;
    }

    public void setNomeComida(String nomeComida) {
        this.nome = nomeComida;
    }

    public double getPesoComida() {
        return peso;
    }

    public void setPesoComida(double pesoComida) {
        this.peso = pesoComida;
    }
}
