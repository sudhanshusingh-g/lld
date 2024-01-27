package Homework2_v2;

import Homework2_v0.BikeType;

public class Bike extends Vehicle {

    BikeType bikeType;
    public Bike(String model,Integer mileage,BikeType bikeType){
        super(model,mileage);
        this.bikeType=bikeType;

    }


    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }
}
