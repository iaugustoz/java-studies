package fundamentos;

import java.util.Scanner;
import java.util.Locale; // Define a minha localização como EUA
public class DesafioConversao {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US")); // Com a localização dos EUA, o resultado sairá 12.5
                                                                  //  ao invés de 12,5, por exemplo
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu 1° salário: ");
        String salario1 = input.nextLine().replace(',','.');

        System.out.print("Informe seu 2° salário: ");
        String salario2 = input.nextLine().replace(',','.');

        System.out.print("Informe seu 3° salário: ");
        String salario3 = input.nextLine().replace(',','.');

        input.close(); // Finalize o Scanner

        Double media = (Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3)) / 3;
        System.out.printf("%.2f", media);
    }
}
