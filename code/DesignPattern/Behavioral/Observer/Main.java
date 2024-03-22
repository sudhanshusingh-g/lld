package code.DesignPattern.Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        Observer subscriber1 = new NewsSubscriber("Subscriber 1");
        Observer subscriber2 = new NewsSubscriber("Subscriber 2");

        publisher.registerObserver(subscriber1);
        publisher.registerObserver(subscriber2);

        publisher.publishNews("Breaking News: COVID-19 vaccine approved!");
    }
}
