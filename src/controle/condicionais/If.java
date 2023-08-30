package controle.condicionais;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nível de alerta de risco: ");
        int alertaDeRisco = Integer.parseInt(input.next());

        if ( (alertaDeRisco >= 0) && (alertaDeRisco <= 10) ) {
            if (alertaDeRisco >= 0 && alertaDeRisco <= 3) {
                System.out.println("RISCO BAIXO!");

            } else if (alertaDeRisco > 3 && alertaDeRisco <= 6) {
                System.out.println("RISCO MÉDIO!");

            } else if (alertaDeRisco > 6 && alertaDeRisco <= 9) {
                System.out.println("RISCO ALTO!");

            } else {
                System.out.println("RISCO GRAVE!");
            }

        } else {
            System.out.println("Número fora da faixa estabelecida.");

        }

        input.close();
    }
}
