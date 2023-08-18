package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = Math.PI;

        double area = PI * Math.pow(raio, 2);

        System.out.println(area);
    }
}
