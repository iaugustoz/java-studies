package a_fundamentos.tiposPrimitivos;

public class TipoString {

    public static void main(String[] args) {

        String s = "Bom dia, X";
        System.out.println(s.replace("X", "Igor")); // Substitui o valor da String original
        System.out.println(s.concat(".")); // Retorna a String original concatenada com o valor passado
        System.out.println(s.length()); //Retorna o comprimento da String
        System.out.println(s.toLowerCase()); // Retorna a String em minúsculo
        System.out.println(s.toUpperCase()); // Retorna a String em maiúsculo
        System.out.println(s.contains("Igor")); // Verifica se tem o valor passado na String
    }
}
