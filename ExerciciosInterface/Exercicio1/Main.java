package ExerciciosInterface.Exercicio1;

public class Main {
    public static void main(String[] args) {
        String message = "Olá, tudo bem?";

        IMessage emailMessage = new EmailMessage();
        IMessage smsMessage = new SmsMessage();
        IMessage wppMessage = new WppMessage();
        IMessage redesSociaisMessage = new RedesSociaisMessage();

        emailMessage.sendMessage(message);
        smsMessage.sendMessage(message);
        wppMessage.sendMessage(message);
        redesSociaisMessage.sendMessage(message);
    }
}
