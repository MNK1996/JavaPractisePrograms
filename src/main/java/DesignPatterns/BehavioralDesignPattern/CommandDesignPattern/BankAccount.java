package DesignPatterns.BehavioralDesignPattern.CommandDesignPattern;

public class BankAccount implements BankCommand{
    private String accNumber;
    private double balance;

    public BankAccount(String accNumber,double initAmount){
        this.accNumber = accNumber;
        this.balance=initAmount;

    }

    public void addAmount(double initAmount){
        balance+=initAmount;
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + accNumber);
        } else {
            System.out.println("Insufficient balance in " + accNumber);
        }
    }


    public void showBalance() {
        System.out.println("Balance in " + accNumber + ": ₹" + balance);
    }







    @Override
    public void execute() {


    }
}