public class DependencyMain {
    public static void main(String[] args) throws Exception {
        NotificationService emailService = new EmailService();
        UserController userController = new UserController(emailService);
        userController.notify("harsh11@gmail.com");

        NotificationService smService = new SmsService();
        UserController userController2 = new UserController(smService);
        userController2.notify("How is the day");
    }
}
