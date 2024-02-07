package ObserverPattern;

import ObserverPattern.Observable.IphoneStockObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailNotificationObserverImpl;
import ObserverPattern.Observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();
        NotificationObserver observer1 = new EmailNotificationObserverImpl("email1@email",iphoneStockObservable);
        NotificationObserver observer2 = new EmailNotificationObserverImpl("email2@email",iphoneStockObservable);
        NotificationObserver observer3 = new EmailNotificationObserverImpl("email3@email",iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(100);
        System.out.println(iphoneStockObservable.getStockCount());


        iphoneStockObservable.setStockCount(0);
        System.out.println(iphoneStockObservable.getStockCount());

        iphoneStockObservable.setStockCount(10);
        System.out.println(iphoneStockObservable.getStockCount());
    }
}
