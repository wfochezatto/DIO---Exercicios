package ExerciciosInterface.Exercicio1;

public class WppMessage implements IMessage {

    public void sendMessage(String message) {
        System.out.println("Enviando mensagem via WhatsApp: " + message);
    }
}
