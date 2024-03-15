package code.MultithreadingandConcurrency.AdderSubtractorProblem.Synchronisation.method;

public class Count {
    int num;
    public Count(int num){
        this.num=num;
    }
    public synchronized void increment(){
        num++;
    }
    public synchronized void decrement(){
        num--;
    }
}
