package code.DesignPattern.Structural.Decorator;

public abstract class IceCreamDecorator implements IceCream{
    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream decoratedIceCream){
        this.decoratedIceCream=decoratedIceCream;
    }

    @Override
    public double getPrice() {
        return decoratedIceCream.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedIceCream.getDescription();
    }
}
