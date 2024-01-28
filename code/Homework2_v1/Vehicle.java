package code.Homework2_v1;

public interface Vehicle {
    void start();
    void stop();
    void accelerate();
    void brake();
    default void go(){
        start();
        accelerate();
        brake();
        stop();
    }
}
