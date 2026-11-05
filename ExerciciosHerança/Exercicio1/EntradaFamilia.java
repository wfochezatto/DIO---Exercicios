package ExerciciosHerança.Exercicio1;

public class EntradaFamilia extends Ingresso {

    private int quantidade;

    // public int getQuantidade() {
    //     return quantidade;
    // }

    public EntradaFamilia(String nome, Float valor, Audio audio, int quantidade) {
        super(nome, valor, audio);
        this.quantidade = quantidade;
    }

    public Float getValor() {
        Float total = super.getValor() * quantidade;
        if(quantidade > 3) {
            total = total * 0.95f;
        }
        return total;
    }

}
