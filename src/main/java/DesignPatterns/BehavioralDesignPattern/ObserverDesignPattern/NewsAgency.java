package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;

public interface NewsAgency {
    void addChannel(NewsChannels addChannel);
     void removeChannel(NewsChannels removeChannel);
     void notifySubsriber(String update);


}