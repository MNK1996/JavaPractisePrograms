package DesignPatterns.BehavioralDesignPattern.MediatorDesignPattern;


public class Airplane implements Flight {
    private String name;
    private ATCMediator mediator;

    public Airplane(String name, ATCMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerFlight(this);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sending message: " + message);
        mediator.notify(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received message: " + message);
    }
}