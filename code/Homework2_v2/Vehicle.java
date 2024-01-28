package code.Homework2_v2;

public abstract class Vehicle {
    String model;
    Integer mileage;

    public Vehicle(String model, Integer mileage) {
        this.model = model;
        this.mileage = mileage;
    }

   abstract public void start();


    abstract public void stop();


    abstract public void accelerate();


    abstract public void brake();
}
