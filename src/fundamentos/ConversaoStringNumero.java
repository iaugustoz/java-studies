package fundamentos;

import java.
import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o 1º número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o 2° número: ");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;

        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Média: %.2f", (soma) / 2);
    }
}
