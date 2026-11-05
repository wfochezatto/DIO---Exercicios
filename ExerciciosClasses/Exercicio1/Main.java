package ExerciciosClasses.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        var Scanner = new Scanner(System.in);
        System.out.println("Digite o valor do depósito inicial da conta: ");
        float depositoInicial = Scanner.nextFloat();
        var conta = new BankAccount(depositoInicial);
        var opcao = 0;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");

            opcao = Scanner.nextInt();
            
            switch(opcao){
                case 1:
                    conta.ConsultarSaldo();
                    break;
                case 2:
                    conta.ConsultarChequeEspecial();
                    break;
                case 3:
                    System.out.println("Digite o valor a ser depositado: ");
                    float valorDeposito = Scanner.nextFloat();
                    conta.Depositar(valorDeposito);
                    break;
                case 4:
                    System.out.println("Digite o valor a ser sacado: ");
                    float valorSaque = Scanner.nextFloat();
                    conta.Sacar(valorSaque);
                    break;
                case 5:
                    System.out.println("Digite o valor do boleto: ");
                    float valorBoleto = Scanner.nextFloat();
                    conta.PagarBoleto(valorBoleto);
                    break;
                case 6:
                    conta.VerificarChequeEspecial();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(opcao != 0);
        
    
    Scanner.close();
    }
}
