package c_classes_e_metodos.classe;

public class Produto {
     String nome;
     double preco;
     static final double DESCONTO = 0.25;

     double precoComDesconto() {
          return preco * (1 - DESCONTO);
     }

     double precoComDesconto(double descontoDoGerente) {
          return preco * (1 - (DESCONTO + descontoDoGerente));
     }
}
