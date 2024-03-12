### Callable and Future
- `Callable` interface is used because `Runnable` do not result.
- If we wantto execute any task which returns a result, we use `Callable` interface.
- It has `call()` method returns a results of type of `V`(aka object).
- The `call()` method can throw an exception so we use the `throws` keyword with `Exception`
```java
public interface Callable<V> {
    V call() throws Exception;
}
```
- In order to execute a task that returns a result, we can use the `submit` method of the `ExecutorService` interface.
- The `submit` method takes a `Callable` object as a parameter. The `submit` method returns a `Future` object.
- The `Future` interface has a method called `get` that returns the result of the task. 
- The `get` method is a blocking method. It waits until the task is completed and then returns the result of the task.
```java
ExecutorService executorService = Executors.newCachedThreadPool();
Future<Integer> future = executorService.submit(() -> 2 + 3);
Integer result = future.get();
```
- `Futures` can be used to cancel tasks. The `Future` interface has a method called `cancel` that can be used to cancel
a task.
- The `cancel` method takes a boolean parameter. If the boolean parameter is true, the task is cancelled even if the
task is already running. If the boolean parameter is false, the task is cancelled only if the task is not running.
```java
ExecutorService executorService = Executors.newCachedThreadPool();
Future<Integer> future = executorService.submit(() -> 2 + 3);
future.cancel(false);
```