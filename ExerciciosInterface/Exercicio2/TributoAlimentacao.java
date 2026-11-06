package ExerciciosInterface.Exercicio2;

public class TributoAlimentacao implements ITributos {

    public double calcularTributos(Produto produto) {
        double valorTributo = produto.getPreco() * 0.01; 
        System.out.printf("Tributo sobre o produto %s: R$ %.2f%n", produto.getNome(), valorTributo);
        return valorTributo;
    }

}
