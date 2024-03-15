package code.MultithreadingandConcurrency.Callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class JavaCallable implements Callable {
    public Object call() throws Exception{
        Random rdmObj=new Random();
        Integer rNo= rdmObj.nextInt(10);
//        Thread.sleep(rNo*1000);
        return rNo;
    }
}
