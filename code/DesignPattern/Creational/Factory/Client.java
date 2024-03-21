package code.DesignPattern.Creational.Factory;

public class Client {
    public static void main(String[] args) {
//        Create factories
        Factory f1=new ConcreteFactory1();
        Factory f2=new ConcreteFactory2();

//        Creating products using factories
        Product p1=f1.createProduct();
        Product p2=f2.createProduct();

//        Operate on Products
        p1.operate();
        p2.operate();
    }
}
