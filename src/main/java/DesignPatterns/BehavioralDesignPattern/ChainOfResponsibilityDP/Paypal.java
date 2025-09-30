package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibilityDP;

public class Paypal extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount<=1500){
            System.out.println("Payment By Paypal :"+ amount);
        }else {
            next.handlePayment(amount);

        }
    }
}