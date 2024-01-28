package code.Homework2_v0;

public class VehicleTest {
    public static void main(String[] args) {
        Car car =new Car("Honda City",20,CarType.SEDAN);
        System.out.println(car.model);
        Bike bike=new Bike("Rayder",25,BikeType.SPORTS);
        System.out.println(bike.model);
    }
}
