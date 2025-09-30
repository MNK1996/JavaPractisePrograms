package DesignPatterns.BehavioralDesignPattern.CommandDesignPattern;

public class CommandDPMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Neel",1000);
        BankCommand bankCommand = new DepositeAmount(account,500);
        BankCommand bankCommandwithDraw = new WithdrawCommand(account,1500);


        TransactionProcess process11 = new TransactionProcess();
        process11.command(bankCommand);
        process11.command(bankCommandwithDraw);
        account.showBalance();

        account.showBalance();
    }







}