package ObserverPattern.Observer;

public class MessageNotificationObserverImpl implements NotificationObserver{

    @Override
    public void update() {
        System.out.println("Message sent to the customer");
    }
}
