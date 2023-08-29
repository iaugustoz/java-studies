package fundamentos.operadores;
public class OperadoresAritmeticos {

    public static void main(String[] args) {

        System.out.println("=====".concat(" OPERADORES ARITMÉTICOS ").concat("====="));

        int a = 5;
        int b = 10;
        double c = 12.3;

        // Operadores (Soma)
        System.out.println("Soma: " + (a + c));

        // Operadores (Subtração)
        System.out.println("Subtração:" + (b - a));

        // Operadores (Divisão)
        System.out.println("Divisão: " + (b / a));

        // Operadores (Multiplicação)
        System.out.println("Multiplicação: " + (b * c));

        // Operadores (Módulo ou resto da divisão)
        System.out.println("Resto da divisão: " + (b % 2));

        // Ordem de precedência dos operadores
        System.out.println("Ordem de precedência: " + (5 + 5 * 9));
    }
}
