package ExerciciosInterface.Exercicio1;

public class EmailMessage implements IMessage {

    public void sendMessage(String message) {
        System.out.println("Enviando mensagem via Email: " + message);
    }

}