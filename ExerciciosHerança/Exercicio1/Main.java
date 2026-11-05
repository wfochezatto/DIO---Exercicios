package ExerciciosHerança.Exercicio1;

public class Main {
    
    public static void main(String[] args) {
        MeiaEntrada ingresso = new MeiaEntrada("Avatar", 20f, Ingresso.Audio.dublado);
        EntradaFamilia ingressoFamilia = new EntradaFamilia("Avatar", 20f, Ingresso.Audio.dublado, 4);

        System.out.println(ingresso.getValor());
        System.out.println(ingressoFamilia.getValor());
    }
}
