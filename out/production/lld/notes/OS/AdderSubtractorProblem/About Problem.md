The Adder Subtract problem is used to demonstrate the need of **synchronisation**.
- Create two different classes `Adder` and `Subtractor`.
- Accept a `count` object in the constructor of both the classes.
- In `Adder`, iterate from 1 to 10000 and increment the count variable by 1 on each iteration.
- In `Subtractor`, iterate from 1 to 10000 and decrement the count variable by 1 on each iteration.
- Print the final value of the count variable.

[Synchronisation Problem](/code/MultithreadingandConcurrency/AdderSubtractorProblem/Main.java)

>Output will be random number everytime.But ideally, the output should have been `0`.
> It means the increment and decrement of both classes are happening synchronously and are running parallel.

#### Characteristics of synchronisation problems
- Critical Section : A section of code that is accessed by multiple threads. When multiple threads access the same
critical section, the result is a synchronisation problem that might yield wrong or inconsistent results.
```java
    public void run() {
        for (int i = 0; i < 100; i++) {
            count.increment(); // Critical section
        }
    }
```
- Race Condition : When more than one thread tries to enter the critical section at the same time.
- Preemption : When a thread is interrupted by another thread.

#### Properties of a good solution
- Mutual Exclusion - Only one thread can access the critical section at a time.
- Progress - If a thread wants to enter the critical section, it will eventually be able to do so.
- Bounded Waiting - If a thread wants to enter the critical section, it will eventually be able to do so, but only after
a finite number of other threads have entered the critical section.
- No busy Waiting - If a thread wants to enter the critical section, it will not be able to do so until the critical
section is free. It has to keep checking if the critical section is free. This is called busy waiting.
- Notification - If a thread is waiting to enter the critical section, it should be notified when the critical section
is free.

### Solutions to synchronisation problems

**Mutex Locks** are a way to solve the synchronisation problem. Mutex locks are a way to ensure that only one thread can
access a critical section at a time. Mutex locks are also known as mutual exclusion locks.

A thread can only access the critical section if it has the lock. If a thread does not have the lock, it cannot access
the critical section. If a thread has the lock, it can access the critical section. If a thread has the lock, it can
release the lock and allow another thread to access the critical section.

[Mutex Solution](/code/MultithreadingandConcurrency/AdderSubtractorProblem/Mutex/Main.java)

**Synchronised Keyword**