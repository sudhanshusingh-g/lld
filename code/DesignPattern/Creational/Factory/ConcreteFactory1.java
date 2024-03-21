package code.DesignPattern.Creational.Factory;

public class ConcreteFactory1 implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
