package code.Thread;


public class NumberPrinter implements Runnable{ //extends Thread {
    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public NumberPrinter(Integer number) {
        this.number = number;
    }

    @Override
    public void run() {

            System.out.println("Number " + number + " is printed by : " + Thread.currentThread().getName());

    }
}
