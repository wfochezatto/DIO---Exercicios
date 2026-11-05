package ExerciciosHerança.Exercicio2;

public class Vendedor extends Funcionario{

    private Integer quantidadeVendas;

    public Vendedor(String nome, String email, String senha, Integer quantidadeVendas) {
        super(nome, email, senha, false);
        this.quantidadeVendas = quantidadeVendas;
    }
    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(Integer quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
}
