package code.DesignPattern.Behavioral.Observer;

//Concrete Observer
public class NewsSubscriber implements Observer{
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received the latest news: " + news);
    }
}
