package c_classes_e_metodos.classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome = "Laptop";
        p1.preco = 4356.29;

        Produto p2 = new Produto();

        p2.nome = "Caneta preta";
        p2.preco = 12.56;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto(0);
        double precoFInal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFInal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
