package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibilityDP;

public class Banking extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount<=500){
            System.out.println("Payment By Banking :"+ amount);
        }else {


            next.handlePayment(amount);

        }
    }
}