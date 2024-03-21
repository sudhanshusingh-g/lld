package code.DesignPattern.Structural.Decorator;

public class IceCreamParlor {
    public static void main(String[] args) {
        IceCream iceCream=new BaseIceCream();
        System.out.println("Price: $"+iceCream.getPrice()+", Description: "+iceCream.getDescription());

        iceCream=new NutDecorator(iceCream);
        System.out.println("Price: $"+iceCream.getPrice()+", Description: "+iceCream.getDescription());

        iceCream=new ChocolateChipDecorator(iceCream);
        System.out.println("Price: $"+iceCream.getPrice()+", Description: "+iceCream.getDescription());

    }
}
