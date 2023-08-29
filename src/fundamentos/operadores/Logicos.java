package fundamentos.operadores;
public class Logicos {

    public static void main(String[] args) {

        System.out.println("=====".concat(" OPERADORES LÓGICOS ").concat("====="));

        System.out.println("Tabela Verdade || (OR): ");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela Verdade && (AND): ");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTabela Verdade ^ (XOR): ");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela Verdade ! (NOT): ");
        System.out.println(!true);
        System.out.println(!false);
    }
}
