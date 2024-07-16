package c_classes_e_metodos.classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaPassado, int mesPassado, int anoPassado) {
        dia = diaPassado;
        mes = mesPassado;
        ano = anoPassado;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
