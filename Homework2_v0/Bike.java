package Homework2_v0;

public class Bike extends Vehicle {

    BikeType biketype;

    public Bike(String model, Integer mileage, BikeType biketype) {
        super(model,mileage);
        this.biketype = biketype;
    }
}
