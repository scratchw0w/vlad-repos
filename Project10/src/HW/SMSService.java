package HW;

public class SMSService implements MessagingService {
    @Override
    public void sendMessage() {
        System.out.println("Отправлено письмо по SMS");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Получено письмо по SMS");
    }
}
