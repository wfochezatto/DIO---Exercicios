package ExerciciosClasses.Exercicio1;

public class BankAccount {
    
    public float saldo;
    public float chequeEspecial;

    public BankAccount(float depositoInicial){
        saldo = depositoInicial;
        CriarChequeEspecial(depositoInicial);
    }
    public void ConsultarSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    public void CriarChequeEspecial(float valor){
        if(valor <= 500){
            chequeEspecial = 50;
            return;
        }
        chequeEspecial = valor / 2;
    }

    public void ConsultarChequeEspecial(){
        System.out.println("Cheque Especial: " + chequeEspecial);
    }

    public void Depositar(float valor){
        float valorUsado = 0;
        if (saldo < 0){
            valorUsado = -saldo;
        }

        saldo += valor;

        if (valorUsado > 0 && saldo >= 0) {
            float taxa = valorUsado * 0.20f;
            saldo -= taxa;

            System.out.println("Taxa do cheque especial: " + taxa);
        }
    }

    public void Sacar(float valor){
        if(valor > saldo + chequeEspecial){
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= valor;
    }

    public void PagarBoleto(float valor){
        if(valor > saldo + chequeEspecial){
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= valor;
    }

    public void CobrarTaxaChequeEspecial(float valor){
        float taxa = valor * 0.20f;
        saldo -= taxa;
        System.out.println("Taxa do cheque especial: " + taxa);
    }

    public void VerificarChequeEspecial(){
        if(saldo < 0){
            System.out.println("A conta está usando cheque especial");
        } 
        else {
            System.out.println("A conta não está usando cheque especial");
        }
    }
}
