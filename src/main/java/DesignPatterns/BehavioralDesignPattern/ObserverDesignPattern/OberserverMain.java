package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;

public class OberserverMain {
    public static void main(String[] args) {

        NewsAgency newsAgency = new ANIAgency();

        NewsChannels ndtvNewsChannel= new NDTVNewsChannel();
        NewsChannels tv9NewsChannel = new TV9NewsChannel();
        newsAgency.addChannel(ndtvNewsChannel);
        newsAgency.addChannel(tv9NewsChannel);

        newsAgency.notifySubsriber("Elections are conducted Soon");


    }
}