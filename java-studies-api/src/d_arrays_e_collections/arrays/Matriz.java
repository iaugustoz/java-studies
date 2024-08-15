package d_arrays_e_collections.arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("===== Matriz - Média de uma turma =====");
        System.out.println("=======================================\n");

        System.out.print("Informe a quantidade de alunos da sua turma: ");
        int amountStudents = input.nextInt();

        System.out.print("Informe a quantidade de avaliações (notas) por aluno: ");
        int amountGrades = input.nextInt();

        double[][] classNotes = new double[amountStudents][amountGrades];

        double total = 0;

        for (int i = 0; i < classNotes.length; i++) {
            for (int j = 0; j < classNotes[i].length; j++) {
                System.out.printf("Informe a %dº nota do %dº aluno: ", (i + 1), (j + 1));
                classNotes[i][j] = input.nextInt();

                total += classNotes[i][j];
            }
        }

        double average = total / (amountStudents * amountGrades);
        System.out.println("\nA média da turma é " + average);

        input.close();
    }
}
