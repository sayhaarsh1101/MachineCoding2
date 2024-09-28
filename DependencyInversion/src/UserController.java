public class UserController {

    private NotificationService notificationService;

    public UserController(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void notify(String message){
        notificationService.sendNotification(message);
    }

}
