package DesignPatterns.BehavioralDesignPattern.CommandDesignPattern;

public class DepositeAmount implements BankCommand{
    private BankAccount bankAccount;
    private double amount;

    public DepositeAmount(BankAccount bankAccount, double amount){
        this.bankAccount = bankAccount;
        this.amount=amount;
    }
    @Override
    public void execute() {
        bankAccount.addAmount(amount);

    }
}