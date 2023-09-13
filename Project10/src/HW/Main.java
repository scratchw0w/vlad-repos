package HW;

public class Main {
    public static void main(String[] args) {
        MessagingService emailService = new EmailService();
        MessagingService smsService = new SMSService();

        MessagingService[] services = new MessagingService[]{emailService, smsService};
        for (int i = 0; i < services.length; i++) {
            services[i].sendMessage();
            services[i].receiveMessage();
        }

        Good laptop = new Good("Laptop", 2, 20000);
        Order order = new Order();
        order.addGood(laptop);
        System.out.println(order.countOrderPrice());
        order.printAllGoods();
    }
}
