Whenever we have a FI(Functional Interface) of which we want to create an anonymous class, we use `lambda`.

```java
// Runnable with Anonymous Class

Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Thread");
    };
};

public static void main(String[] args) {
    Thread t=new Thread(r);
    t.start();
}


//Runnable with Lambda
Runnable r=()-> System.out.println("Thread");
```

Body of Lambda
```
(a,b)->{
    //body 
}
```

When having a single line in the body , we can skip `{ }`.


Having single parameter
```java
interface A{
    void a(int n);
}

public static void main(String[] args) {
    A aLambda=n-> System.out.println(n*n);
    aLambda.a(4);//16
}
```