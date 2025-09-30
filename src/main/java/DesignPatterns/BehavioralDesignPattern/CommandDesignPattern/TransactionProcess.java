package DesignPatterns.BehavioralDesignPattern.CommandDesignPattern;

public class TransactionProcess {
    public void command(BankCommand bankCommand){
        bankCommand.execute();
    }
}