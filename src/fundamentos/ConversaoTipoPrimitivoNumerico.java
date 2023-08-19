package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1; // conversão implícita (de 1 para 1.0)
        System.out.println(a);

        float b = (float) 1.4543; // conversão explícita (por padrão qualquer valor decimal é double)
        System.out.println(b);

        int c = 125;
        byte d = (byte) c; // conversão explícita
        System.out.println(d);

        double e = 1.999999999;
        int f = (int) e; // conversão explícita
        System.out.println(f);
    }
}
