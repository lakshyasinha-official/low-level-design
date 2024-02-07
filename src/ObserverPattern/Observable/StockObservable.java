package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver observer);

    public void remove(NotificationObserver observer);

    public void notifySubscriber();

    public void setStockCount(int newStock);

    public  int getStockCount();


}
