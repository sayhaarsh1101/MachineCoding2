package observer;

import observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

     String email;
     StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable){
        this.email = email;
        this.observable = observable;
    }


    @Override
    public void update() {
        sendEmail(email, "product is in stock");
    }

    private void sendEmail(String email, String message){
        System.out.println("Email sent to" + email +" with message" +message);

    }

}
