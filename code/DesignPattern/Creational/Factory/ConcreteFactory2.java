package code.DesignPattern.Creational.Factory;

public class ConcreteFactory2 implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
