package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibilityDP;

public class CreditCard extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount<=1000){
            System.out.println("Payment By Credit Card :"+ amount);
        }else {
            next.handlePayment(amount);

        }
    }
}