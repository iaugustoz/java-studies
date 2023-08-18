package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
    // (ºF - 32) x 5/9.0 = ºC
        final int AJUSTE = 32; // Constante
        final double FATOR = 5/9.0; // Constante
        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println(celsius);
    }
}
