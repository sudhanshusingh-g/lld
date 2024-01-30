### Solution to synchronisation problem
- **`Mutex Locks`**
  Mutex locks are a way to solve the synchronisation problem. Mutex locks are a way to ensure that only one thread can access a critical section at a time. Mutex locks are also known as mutual exclusion locks.

A thread can only access the critical section if it has the lock. If a thread does not have the lock, it cannot access the critical section. If a thread has the lock, it can access the critical section. If a thread has the lock, it can release the lock and allow another thread to access the critical section.

Think of a room with a lock. Only one person can enter the room at a time. If a person has the key, they can enter the room. If a person does not have the key, they cannot enter the room. If a person has the key, they can leave the room and give the key to another person. This is the same as a mutex lock.

#### Properties of a mutex lock
- `Lock` - A thread can only access the critical section if it has the lock.
- Only one thread can have the lock at a time.
- Other threads cannot access the critical section if a thread has the lock and thus have to wait.
- Lock will automatically be released when the thread exits the critical section.

```java
//Runner.java

Counter count=new Counter(0);
        Lock lock=new ReentrantLock();

```

```java
//Adder.java
lock.lock();
Integer value=count.getCount();
count.setCount(value+i);
lock.unlock();


//Subtractor.java
lock.lock();
Integer value=count.getCount();
count.setCount(value-i);
lock.lock();
```
