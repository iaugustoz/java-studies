package d_arrays_e_collections.arrays;

public class ExercicioForEach {

    public static void main(String[] args) {

        double[] gradesSemester = new double[2];

        gradesSemester[0] = 9;
        gradesSemester[1] = 9;

        double total = 0;

        for (double grade: gradesSemester) {
            total += grade;
            System.out.printf("Nota: %f\n", grade);
        }

        System.out.printf("Média de notas: %f", (total / gradesSemester.length));
    }
}
