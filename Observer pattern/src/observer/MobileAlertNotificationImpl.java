package observer;

import observable.StockObservable;

public class MobileAlertNotificationImpl implements NotificationAlertObserver{

    private String username;
    private StockObservable stockObservable;

    public MobileAlertNotificationImpl(String username, StockObservable stockObservable){

    }
    @Override
    public void update(){
        sendMessage(username, "product is in stock");
    }

    private void sendMessage(String username, String message){
        System.out.println("Message send to the username" + username + "and" + message);
    }

}
