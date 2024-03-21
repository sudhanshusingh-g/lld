package code.DesignPattern.Structural.Decorator;

public class BaseIceCream implements IceCream{
    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "Base Ice-Cream";
    }
}
