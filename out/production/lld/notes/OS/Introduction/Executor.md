### Executor
- is an interface to execute task.
- It has only one method `execute()` that takes a `Runnable` object as a parameter.
- Once we create a `Runnable` object we use `ExecutorService` to use `Executors` which has methods like
`newCachedThreadPool`,`newFixedThreadPool` etc.
- So that we don't have to create threads everytime, the `ExecutorService` will re-use the threads based on the
requirements from the thread pools.
- The `execute` method do not return result and it will keep on running until and unless we use methods like
`shutdown()` to closed the Thread pool.

[Code](/code/MultithreadingandConcurrency/Executor/Example)