package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationObserver {


    String email;
    StockObservable stockObservable;

    public EmailNotificationObserverImpl(String email,StockObservable stockObservable){
        this.email = email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        sendMail(email,"Email send to the customer");

    }

    private void sendMail(String email, String emailSendToTheCustomer) {
        // code to send email to customer
        System.out.println(emailSendToTheCustomer+"  "+email);
    }
}
