package code.DesignPattern.Structural.Decorator;

public class NutDecorator extends IceCreamDecorator{
    public NutDecorator(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+0.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", with nuts";
    }
}
