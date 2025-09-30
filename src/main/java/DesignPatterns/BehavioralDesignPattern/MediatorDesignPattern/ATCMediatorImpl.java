package DesignPatterns.BehavioralDesignPattern.MediatorDesignPattern;


import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {
    private List<Flight> flights = new ArrayList<>();

    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void notify(String message, Flight sender) {
        for (Flight flight : flights) {
            if (flight != sender) {
                flight.receive(message);
            }
        }
    }
}