package a_fundamentos.operadores;
public class OperadoresUnarios {

    public static void main(String[] args) {
        // Crie um programa Java que declare duas variáveis inteiras. Em seguida, utilize o operador unário de
        // pré-incremento em uma das variáveis e o operador unário de pós-incremento na outra variável. Imprima os
        // valores originais e os valores após a aplicação dos operadores unários.

        int numero1 = 1;
        int numero2 = 2;

        System.out.printf("Valores originais: %d e %d", numero1, numero2);
        System.out.printf("\nValores após o incremento e decremento: %d %d", ++numero1, --numero2);
    }
}
