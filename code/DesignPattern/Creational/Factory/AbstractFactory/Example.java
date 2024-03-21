package code.DesignPattern.Creational.Factory.AbstractFactory;

public class Example {
    public static void main(String[] args) {

        FurnitureFactory modernFactory=new ModernFurnitureFactory();

//        Create modern chair and sofa
        Chair modernChair=modernFactory.createChair();
        Sofa modernSofa=modernFactory.createSofa();

        modernChair.sitOn();
        modernSofa.sitOn();

    }
}

