package ExerciciosInterface.Exercicio2;

public class TributoVestuario implements ITributos {

    public double calcularTributos(Produto produto) {
        double valorTributo = produto.getPreco() * 0.025; 
        System.out.printf("Tributo sobre o produto %s: R$ %.2f%n", produto.getNome(), valorTributo);
        return valorTributo;
    }

}
