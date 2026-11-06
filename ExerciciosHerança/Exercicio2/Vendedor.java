package ExerciciosHerança.Exercicio2;

public class Vendedor extends Funcionario{

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        super(nome, email, senha, false);
        this.quantidadeVendas = quantidadeVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public void realizarVenda() {
        this.quantidadeVendas++;
        
    }

    public void consultarVendas() {
        System.out.println("Quantidade de vendas realizadas: " + getQuantidadeVendas());
    }
}
