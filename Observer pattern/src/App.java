import observable.StockObservable;
import observable.StockObservableImpl;
import observer.EmailAlertObserverImpl;
import observer.MobileAlertNotificationImpl;
import observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {

        StockObservable stockObservable = new StockObservableImpl();

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImpl("harsh2@gmail.com", stockObservable);
        NotificationAlertObserver notificationAlertObserver2 = new MobileAlertNotificationImpl("Harsh Kumar", stockObservable);

        stockObservable.add(notificationAlertObserver1);
        stockObservable.add(notificationAlertObserver2);

        stockObservable.setStockCount(20);
    

        

        
    }
}
