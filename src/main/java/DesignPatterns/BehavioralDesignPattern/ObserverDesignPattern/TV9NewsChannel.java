package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;

public class TV9NewsChannel implements NewsChannels{

    @Override
    public void update(String news) {
        System.out.println("TV9 Received :"+ news);
    }
}