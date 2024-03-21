package code.DesignPattern.Creational.Factory.AbstractFactory;

public class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on modern chair");
    }
}
