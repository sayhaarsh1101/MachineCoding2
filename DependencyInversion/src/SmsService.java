public class SmsService implements NotificationService{

    @Override
     public void sendNotification(String message){
        System.out.println("Sms sent" + message);
     }

}
