package ExerciciosInterface.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Livro", 50.0);
        Produto produto2 = new Produto("Alimento", 20.0);
        Produto produto3 = new Produto("Remédio", 30.0);
        Produto produto4 = new Produto("Roupa", 100.0);

        ITributos tributoCultura = new TributoCultura();
        ITributos tributoAlimentacao = new TributoAlimentacao();
        ITributos tributoSaude = new TributoSaude();
        ITributos tributoVestuario = new TributoVestuario();

        tributoCultura.calcularTributos(produto1);
        tributoAlimentacao.calcularTributos(produto2);
        tributoSaude.calcularTributos(produto3);
        tributoVestuario.calcularTributos(produto4);
    }
}
