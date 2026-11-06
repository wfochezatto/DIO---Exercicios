package ExerciciosHerança.Exercicio2;
//Valor em caixa e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.
public class Atendente extends Funcionario {

    private float valorEmCaixa;

    public Atendente(String nome, String email, String senha, float valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }
    
    public float getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(float valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    public void receberPagamento(float valor) {
        this.valorEmCaixa += valor;
    }

    public void fecharCaixa() {
        this.valorEmCaixa = 0.0f;
    }
}
