package code.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(0);

        // Atomic increment
        int result = atomicInt.incrementAndGet();
        System.out.println("Incremented: " + result);

        // Atomic decrement
        result = atomicInt.decrementAndGet();
        System.out.println("Decremented: " + result);

        // Atomic add
        result = atomicInt.addAndGet(5);
        System.out.println("Added 5: " + result);

        // Atomic get and set
        int previousValue = atomicInt.getAndSet(10);
        System.out.println("Previous value: " + previousValue + ", Current value: " + atomicInt.get());
    }
}
