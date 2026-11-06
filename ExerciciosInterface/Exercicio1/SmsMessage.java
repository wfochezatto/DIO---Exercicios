package ExerciciosInterface.Exercicio1;

public class SmsMessage implements IMessage {

    public void sendMessage(String message) {
        System.out.println("Enviando mensagem via SMS: " + message);
    }

}