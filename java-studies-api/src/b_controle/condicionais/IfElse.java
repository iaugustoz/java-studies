package b_controle.condicionais;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String sexo = JOptionPane.showInputDialog("Iforme seu sexo (Sendo, M para masculino e F para feminino: ");

        if (sexo.length() > 0) {
            if (sexo.toUpperCase().equals("M")) {
                JOptionPane.showMessageDialog(null, "Você é um homem!");

            } else {
                JOptionPane.showMessageDialog(null, "Você é uma mulher!");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Informe um sexo válido!");
        }


    }
}
