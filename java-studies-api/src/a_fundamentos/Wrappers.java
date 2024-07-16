package a_fundamentos;

public class Wrappers {

    public static void main(String[] args) {

        // Objetos Integer
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // int
        Long l = 100000L;

        // Objetos Floating point
        Float f = 123.01F;
        Double d = 1345.90;

        // Objeto Boolean
        Boolean bo = true;
        System.out.println(bo.booleanValue());

        // Objeto Character
        Character c = '#';
        System.out.println(c.charValue());

        // Métodos associados
        System.out.println(b.byteValue());
    }
}
