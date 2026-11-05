package ExerciciosClasses.Exercicio2;

public class Carro {

    public int velocidade;
    public int marcha;
    public boolean ligado;

    public Carro(){
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
    }

    public void LigarCarro(){
        this.ligado = true;
    }

    public void DesligarCarro(){
        if(this.marcha == 0 && this.velocidade == 0){
            this.ligado = false;
        }
    }

    public void Acelerar(){
        if(this.ligado == false){
            System.out.println("O carro está desligado");
            return;
        }
        switch(this.marcha){
            case 0:
                System.out.println("O carro está em ponto morto, não é possível acelerar");
                break;
            case 1:
                if(this.velocidade < 20){
                    this.velocidade++;
                }
                else{
                    System.out.println("A velocidade máxima para a marcha 1 é 20km/h");
                }
                break;
            case 2:
                if(this.velocidade < 40){
                    this.velocidade++;
                }
                else{
                    System.out.println("A velocidade máxima para a marcha 2 é 40km/h");
                }
                break;
            case 3:
                if(this.velocidade < 60){
                    this.velocidade++;
                }
                else{
                    System.out.println("A velocidade máxima para a marcha 3 é 60km/h");
                }
                break;
            case 4:
                if(this.velocidade < 80){
                    this.velocidade++;
                }
                else{
                    System.out.println("A velocidade máxima para a marcha 4 é 80km/h");
                }
                break;
            case 5:
                if(this.velocidade < 100){
                    this.velocidade++;
                }
                else{
                    System.out.println("A velocidade máxima para a marcha 5 é 100km/h");
                }
                break;
            case 6:
                if(this.velocidade < 120){
                    this.velocidade++;
                }
                else{
                    System.out.println("A velocidade máxima para a marcha 6 é 120km/h");
                }
                break;
        }
        
    }

    public void DiminuirVelocidade(){
        if(this.ligado == false){
            System.out.println("O carro está desligado");
            return;
        }
        switch(this.marcha){
            case 0:
                System.out.println("O carro está em ponto morto, não é possível desacelerar");
                break;
            case 6:
                if(this.velocidade > 101){
                    this.velocidade--;
                }
                break;
            case 5:
                if(this.velocidade > 81){
                    this.velocidade--;
                }
                break;
            case 4:
                if(this.velocidade > 61){
                    this.velocidade--;
                }
                break;
            case 3:
                if(this.velocidade > 41){
                    this.velocidade--;
                }
                break;
            case 2:
                if(this.velocidade > 21){
                    this.velocidade--;
                }
                break;
            case 1:
                if(this.velocidade > 1){
                    this.velocidade--;
                }
                break;
        }
    }

    public void VirarEsquerda(){
        if(this.velocidade >= 1 && this.velocidade <= 40){
            System.out.println("Virando para esquerda");
        }
    }

    public void VirarDireita(){
        if(this.velocidade >= 1 && this.velocidade <= 40){
            System.out.println("Virando para direita");
        }
    }
    public void SubirMarcha(){
        if(this.ligado == false){
            System.out.println("O carro está desligado, não é possível subir a marcha");
            return;
        }
        if (this.ligado == true && this.marcha == 0){
            this.marcha++;
        }
        else if (this.velocidade == 20 && this.marcha == 1){
            this.marcha++;
        }
        else if (this.velocidade == 40 && this.marcha == 2){
            this.marcha++;
        }
        else if (this.velocidade == 60 && this.marcha == 3){
            this.marcha++;
        }
        else if (this.velocidade == 80 && this.marcha == 4){
            this.marcha++;
        }
        else if (this.velocidade == 100 && this.marcha == 5){
            this.marcha++;
        }
        else{
            System.out.println("Não é possível subir a marcha");
        }
        
    }

    public void DescerMarcha(){
        if(this.ligado == false){
            System.out.println("O carro está desligado, não é possível descer a marcha");
            return;
        }
        if(this.velocidade == 0 && this.marcha == 1){
            this.marcha--;
        }
        else if(this.velocidade == 21 && this.marcha == 2){
            this.marcha--;
        }
        else if(this.velocidade == 41 && this.marcha == 3){
            this.marcha--;
        }
        else if(this.velocidade == 61 && this.marcha == 4){
            this.marcha--;
        }
        else if(this.velocidade == 81 && this.marcha == 5){
            this.marcha--;
        }
        else if(this.velocidade == 101 && this.marcha == 6){
            this.marcha--;
        }
        else{
            System.out.println("Não é possível descer a marcha");
        }
    }
    public void VerificarVelocidade(){
        System.out.println("A velocidade atual é: " + this.velocidade + "km/h");
    }
}
