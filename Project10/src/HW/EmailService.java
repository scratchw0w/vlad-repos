package HW;

public class EmailService implements MessagingService {
    @Override
    public void receiveMessage() {
        System.out.println("Получено письмо по электронной почте");
    }

    @Override
    public void sendMessage() {
        System.out.println("Отправлено письмо по электронной почте");
    }
}
