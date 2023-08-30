package controle.condicionais;
public class DesafioIf {

    public static void main(String[] args) {

        double nota = 1.3;

        if (nota >= 9.0); {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!");
        }

        /*O erro deste código está no ponto e vírgulo depois da condição. O Java interpreta
        todo código terminado em ; como uma sentença, tirando o ; o código volta ao normal */
    }
}
