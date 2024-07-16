package a_fundamentos.operadores;

import java.util.Scanner;

public class Relacionais {

    public static void main(String[] args) {
        // Faça um programa que solicita a nota de um aluno e, com base na nota, exibe a classificação: "A" (90-100),
        // "B" (80-89), "C" (70-79), "D" (60-69) ou "F" (<60).
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        int nota = input.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("Classificação A - Faixa (90-100)");

        } else if (nota >= 80 && nota <= 89) {
            System.out.println("Classificação B - Faixa (80-89)");

        } else if (nota >= 70 && nota <= 79) {
            System.out.println("Classificação C - Faixa (70-79)");

        } else if (nota >= 60 && nota <= 69) {
            System.out.println("Classificação D - Faixa (60-69)");

        } else {
            System.out.println("Classificação F - Faixa (< 60)");

        }
        
    }
}
