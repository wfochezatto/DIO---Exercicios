package ExerciciosHerança.Exercicio2;
//Valor em caixa e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.
public class Atendente extends Funcionario {

    private Float valorEmCaixa;

    public Atendente(String nome, String email, String senha, Float valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }
    
    public Float getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(Float valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
