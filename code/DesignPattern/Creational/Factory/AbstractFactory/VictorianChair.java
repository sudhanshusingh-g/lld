package code.DesignPattern.Creational.Factory.AbstractFactory;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Chair");
    }
}
