package code.OCP.v2;

import code.SRP.v1.BirdType;

public abstract class Bird {
    private String color;
    private Double weight;
    private BirdType type;

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public BirdType getType() {
        return type;
    }

        public abstract void fly();
    public void eat(){
        System.out.println("Eat");
    }





}
