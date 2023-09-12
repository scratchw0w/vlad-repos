package HW;

public class Main {
    public static void main(String[] args) {
        MessagingService emailService = new EmailService();
        MessagingService smsService = new SMSService();

        emailService.sendMessage();
        emailService.receiveMessage();
        smsService.sendMessage();
        smsService.receiveMessage();
    }
}
