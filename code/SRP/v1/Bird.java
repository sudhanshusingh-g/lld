package code.SRP.v1;

public class Bird {
    public String color;
    public Double weight;
    public BirdType type;

    public void fly(BirdType type){
        if(type == BirdType.EAGLE){
            System.out.println("Eagle flies");
        } else if (type==BirdType.PARROT) {
            System.out.println("Penguin cannot fly");
        } else if (type==BirdType.VULTURE) {
            System.out.println("Vulture flies");
        }
    }
    public void eat(){
        System.out.println("Eat");
    }





}
