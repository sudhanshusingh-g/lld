package code.EncapsulationCode;
public class BankAccount{
//    States
    private int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
    }

    //    Behaviour
    public void transfer(int amount, BankAccount to,BankAccount from){
        this.withdraw(amount);
        from.deposit(amount);
        System.out.println(to.balance);
        System.out.println(from.balance);
    }

    private void deposit(int amount) {
        this.balance+=amount;
    }

    private void withdraw(int amount) {
        this.balance-=amount;
    }

}
