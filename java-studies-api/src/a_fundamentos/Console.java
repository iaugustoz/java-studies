package a_fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();// Entrada de dados (Input)
        System.out.printf("Prazer, %s.\n", nome);// Saída de dados (Output)

        System.out.print("Digite o modelo do carro: ");
        String modelo = input.nextLine();
        System.out.print("Digite o ano de fabricação: ");
        int anoFab = input.nextInt();

        System.out.printf("%s fabricado no ano de %d.", modelo, anoFab);
        input.close();
    }
}
