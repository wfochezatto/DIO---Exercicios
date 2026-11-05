package ExerciciosHerança.Exercicio2;
//A classe Gerente deve ter os métodos Gerar relatório financeiro, 
// Consultar vendas, Realizar login, Realizar logff, alterar dados, alterar senha;
public class Gerente extends Funcionario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatório financeiro...");
    }

    public void consultarVendas(Vendedor vendedor) {
        System.out.println("Quantidade de vendas realizadas: " + vendedor.getQuantidadeVendas());
    }
}
