package code.Test1;

public class Test {
    public static void main(String[] args) {
        Example example=new Example();
        example.num=3;

        A a=new A();
        System.out.println(a.B);
    }
}

class A extends Example{
    int B=num;
}