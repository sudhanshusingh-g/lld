package code.DesignPrinciples.v_0;

public class Main {
    public static void main(String[] args) {
        Bird eagle=new Bird("brown",10,BirdType.EAGLE);
        eagle.fly();
        Bird parrot=new Bird("brown",10,BirdType.PARROT);
        parrot.fly();
    }
}
