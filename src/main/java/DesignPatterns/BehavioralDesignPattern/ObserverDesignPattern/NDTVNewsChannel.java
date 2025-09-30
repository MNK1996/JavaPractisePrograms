package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;

public class NDTVNewsChannel implements NewsChannels{

    @Override
    public void update(String news) {
        System.out.println("NDTV Received :"+ news);
    }
}