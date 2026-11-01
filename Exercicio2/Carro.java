// Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
// Ligar o carro;
// Desligar o carro;
// Acelerar;
// diminuir velocidade;
// virar para esquerda/direita
// verificar velocidade;
// trocar a marcha
// Siga as seguintes regras na implementação

// Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
// O carro desligado não pode realizar nenhuma função;
// Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
// Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
// o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
// A velocidade do carro deve respeitar os seguintes limites para cada velocidade
// se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
// se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
// se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
// se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
// se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
// se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
// se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
// O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
// O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;

package Exercicio2;

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
