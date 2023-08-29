package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        System.out.println("===== ".concat("DESAFIO ARITMÉTICO ").concat("====="));

        double superiorA = Math.pow( (6* (3 + 2)) ,2) / (3 * 2) ;
        double superiorB = Math.pow( ((1 - 5) * (2 - 7) / 2) , 2);
        double superior = Math.pow( (superiorA - superiorB), 3) / Math.pow(10, 3);

        System.out.println("Resultado: " + superior);
    }
}
