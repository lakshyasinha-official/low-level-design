package ObserverPattern.Observable;

import ObserverPattern.Observer.EmailNotificationObserverImpl;
import ObserverPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{

    public int stock = 0 ;
    ArrayList<NotificationObserver> observersList = new ArrayList<>();
    @Override
    public void add(NotificationObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationObserver notificationObserver :observersList){
            notificationObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(stock ==0){
            notifySubscriber();
        }
        stock = newStock ;

    }

    @Override
    public int getStockCount() {
        return stock;
    }
}
