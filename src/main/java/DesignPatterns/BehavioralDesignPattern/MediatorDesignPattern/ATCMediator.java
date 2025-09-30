package DesignPatterns.BehavioralDesignPattern.MediatorDesignPattern;

public interface ATCMediator {
    void registerFlight(Flight flight);
    void notify(String msg, Flight sender);
}