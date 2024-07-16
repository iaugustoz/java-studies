package a_fundamentos.operadores;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a 1º Nota: ");
        double nota1 = Double.parseDouble(input.nextLine());

        System.out.print("Digite a 2° Nota: ");
        double nota2 = Double.parseDouble(input.nextLine());

        double media = (nota1 + nota2) / 2;
        media = Math.round(media);

        String passouDeAno = media >= 7.0 ? "aprovado." : "reprovado.";

        System.out.printf("Com média de %s você está %s", media, passouDeAno);

        input.close(); // Encerra o Scanner

    }
}
