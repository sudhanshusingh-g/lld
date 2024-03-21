package code.DesignPattern.Structural.Decorator;

public class ChocolateChipDecorator extends IceCreamDecorator {
    public ChocolateChipDecorator(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",with chocolate chips";
    }
}
