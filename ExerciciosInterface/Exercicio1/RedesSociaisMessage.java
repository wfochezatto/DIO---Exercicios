package ExerciciosInterface.Exercicio1;

public class RedesSociaisMessage implements IMessage {

    public void sendMessage(String message) {
        System.out.println("Enviando mensagem via Redes Sociais: " + message);
    }

}
