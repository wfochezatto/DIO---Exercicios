package Exercicio3;

public class Ingresso {

    private Float valor;

    private String nome;

    private Audio audio;

    public enum Audio{
        dublado, 
        legendado
    }

    public Ingresso(Float valor) {
        this.valor = valor;
    }

    public Ingresso(String nome, Float valor, Audio audio) {
        this.nome = nome;
        this.valor = valor;
        this.audio = audio;
    }


    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

}
