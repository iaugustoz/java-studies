package c_classes_e_metodos.classe.desafio;

public class Pessoa {

    private String nome;

    private double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.getPesoComida();
        }
    }

    public void apresentar() {
        System.out.println("Olá, sou o " + nome + " e tenho " + peso + "Kgs.");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
