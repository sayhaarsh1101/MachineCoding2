package observable;

import java.util.ArrayList;
import java.util.List;

import observer.NotificationAlertObserver;

public class StockObservableImpl implements StockObservable{

     public List<NotificationAlertObserver> notificationAlertObservers= new ArrayList<>();
     public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver){
        notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver){
        notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver notificationAlertObserver : notificationAlertObservers){
            notificationAlertObserver.update();
        }

    }

    @Override
    public void setStockCount(int stockAmount){
        if(stockCount == 0){
            notifySubscribers();
            stockCount = stockCount + stockAmount;
        }

    }

    @Override
    public int getStockCount(){
        return stockCount;
    }

}
