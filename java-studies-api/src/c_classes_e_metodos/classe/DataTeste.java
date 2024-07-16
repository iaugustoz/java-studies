package c_classes_e_metodos.classe;

public class DataTeste {
    public static void main(String[] args) {
        System.out.println("===== EXERCÍCIO - Criar construtor =====\n");

        Data d1 = new Data();

        System.out.printf("Dia de nascimento: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);

        Data d2 = new Data(13, 7, 2024);

        System.out.printf("Data atual: %d/%d/%d\n", d2.dia, d2.mes, d2.ano);

        String dataFormatada1 = d1.obterDataFormatada();
        System.out.println(dataFormatada1);
    }
}
