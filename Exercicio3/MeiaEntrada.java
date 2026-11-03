package Exercicio3;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(String nome, Float valor, Audio audio) {

        super(nome, valor, audio);
    }

    public Float getValor() {
        return super.getValor() / 2;
    }
}
