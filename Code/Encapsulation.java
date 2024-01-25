package Code;

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Hello");
        BankAccount alice=new BankAccount(12,"Alice",500);
        BankAccount bob=new BankAccount(10,"Bob",300);
        alice.transfer(150,alice,bob);
    }
}
