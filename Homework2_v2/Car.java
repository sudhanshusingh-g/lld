package Homework2_v2;

import Homework2_v0.CarType;

public class Car extends Vehicle {

    CarType carType;

    public Car(String model, Integer mileage,CarType carType) {
        super(model, mileage);
        this.carType=carType;
    }


    @Override
    public void start() {

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
