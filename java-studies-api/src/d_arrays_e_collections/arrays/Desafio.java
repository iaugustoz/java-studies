package d_arrays_e_collections.arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("== DESAFIO - MÉDIAS DE NOTAS ==\n");
        System.out.print("Informe a quantidade de notas: ");

        int index = input.nextInt();

        double[] grades = new double[index];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Nota %d: ", (i + 1));
            grades[i] = Double.parseDouble(input.next());;
        }

        double sum = 0;

        for (double item : grades) {
            sum += item;
        }

        System.out.printf("\nMédia do aluno: %f", (sum / grades.length));

        input.close();
    }
}
