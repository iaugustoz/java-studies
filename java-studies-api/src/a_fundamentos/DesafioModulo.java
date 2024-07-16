package a_fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class DesafioModulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de Dados
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º Valor: "));
        String operador = JOptionPane.showInputDialog("Qual operação você deseja realizar? (+, -, /, * ou %");
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º Valor: "));

        // Processamento e Saída de Dados
        if (operador.trim().equals("-")) {
            JOptionPane.showMessageDialog(null, (num1 + " - " + num2 + " = " + (num1 - num2)));

        } else if (operador.trim().equals("+")) {
            JOptionPane.showMessageDialog(null, (num1 + " + " + num2 + " = " + (num1 + num2)));

        } else if (operador.trim().equals("/")) {
            JOptionPane.showMessageDialog(null, (num1 + " / " + num2 + " = " + (num1 / num2)));

        } else if (operador.trim().equals("*")) {
            JOptionPane.showMessageDialog(null, (num1 + " * " + num2 + " = " + (num1 * num2)));

        } else if (operador.trim().equals("%")) {
            JOptionPane.showMessageDialog(null, (num1 + " % " + num2 + " = " + (num1 % num2)));

        } else {
            JOptionPane.showMessageDialog(null, "Operação inexistente!");
        }

        input.close();
    }
}
