package d_arrays_e_collections.arrays;

import java.util.Arrays;

public class Exercicios {

    public static void main(String[] args) {
        double[] grades = new double[2];

        grades[0] = 7.9;
        grades[1] = 9.0;

        double total = 0;

        String result = Arrays.toString(grades);

        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        System.out.printf("==============================\n");
        System.out.printf("Impressão do Array: %s\nSoma das notas: %f\nMédia: %f\n", result, total, (total / grades.length));
    }
}
