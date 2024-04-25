package code.MultithreadingandConcurrency.Runnable;

class PrintNumbers {
    private int number = 1;
    private final int limit = 100;

    public synchronized void printOdd() {
        while (number <= limit) {
            if (number % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printEven() {
        while (number <= limit) {
            if (number % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
