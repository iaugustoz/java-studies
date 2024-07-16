package a_fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Olá, X";
        s = s.toUpperCase();
        s = s.replace("X", "Senhora");
        s = s.concat("!!");
        System.out.println(s);

        System.out.println("Igor".toUpperCase());

        String y = "Oi, W".replace("W","Igor").concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int a = 3;
    }
}
