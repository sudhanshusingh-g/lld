package code.LSP.v3;

public class Swan extends Bird implements Swimmable,Flyable{
    @Override
    public void swim() {
        System.out.println("Swan can swim!");
    }

    @Override
    public void fly() {
        System.out.println("Swan can fly!");
    }
}
