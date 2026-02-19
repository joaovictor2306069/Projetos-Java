public class obterdata {

    int dia;
    int mes;
    int ano;

    String dataAtual() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
