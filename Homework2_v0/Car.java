package Homework2_v0;

public class Car extends Vehicle {

    CarType cartype;

    public Car(String model, Integer mileage, CarType cartype) {
        super(model, mileage);
        this.cartype = cartype;
    }
}
