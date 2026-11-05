package ExerciciosClasses.Exercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Frear");
            System.out.println("5 - Subir marcha");
            System.out.println("6 - Descer marcha");
            System.out.println("7 - Virar para esquerda");
            System.out.println("8 - Virar para direita");
            System.out.println("9 - Verificar velocidade");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    carro.LigarCarro();
                    break;
                case 2:
                    carro.DesligarCarro();
                    break;
                case 3:
                    carro.Acelerar();
                    break;
                case 4:
                    carro.DiminuirVelocidade();
                    break;
                case 5:
                    carro.SubirMarcha();
                    break;
                case 6:
                    carro.DescerMarcha();
                    break;
                case 7:
                    carro.VirarEsquerda();
                    break;
                case 8:
                    carro.VirarDireita();
                    break;
                case 9:
                    carro.VerificarVelocidade();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);
    }

}
