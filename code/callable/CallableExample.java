package code.callable;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "I am returning a call";
    }
}
