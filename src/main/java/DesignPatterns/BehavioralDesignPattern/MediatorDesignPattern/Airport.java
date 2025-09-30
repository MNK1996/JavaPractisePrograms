package DesignPatterns.BehavioralDesignPattern.MediatorDesignPattern;


public class Airport {
    public static void main(String[] args) {
        ATCMediator mediator = new ATCMediatorImpl();

        Flight flight1 = new Airplane("Flight A", mediator);
        Flight flight2 = new Airplane("Flight B", mediator);
        Flight flight3 = new Airplane("Flight C", mediator);

        flight1.send("Requesting permission to land.");
        flight2.send("Holding pattern initiated.");
    }
}