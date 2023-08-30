package controle.condicionais;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o dia da semana: ");
        String diaDaSemana = input.next();

        if (diaDaSemana.trim().toLowerCase().equals("domingo")) {
            System.out.printf("Hoje é o %dº dia da semana!", 1);

        } else if (diaDaSemana.trim().equalsIgnoreCase("segunda-feira")) {
            System.out.printf("Hoje é o %dº dia da semana!", 2);

        } else if (diaDaSemana.trim().equalsIgnoreCase("terça-feira")) {
            System.out.printf("Hoje é o %dº dia da semana!", 3);

        } else if (diaDaSemana.trim().equalsIgnoreCase("quarta-feira")) {
            System.out.printf("Hoje é o %dº dia da semana!", 4);

        } else if (diaDaSemana.trim().equalsIgnoreCase("quinta-feira")) {
            System.out.printf("Hoje é o %dº dia da semana!", 5);

        } else if (diaDaSemana.trim().equalsIgnoreCase("sexta-feira")) {
            System.out.printf("Hoje é o %dº dia da semana!", 6);

        } else if (diaDaSemana.trim().equalsIgnoreCase("sábado")) {
            System.out.printf("Hoje é o %dº dia da semana!", 7);

        } else {
            System.out.printf("O dado digitado é inválido.");
        }

        input.close();
    }
}
