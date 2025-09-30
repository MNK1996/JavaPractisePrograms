package DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ANIAgency implements NewsAgency {
    private List<NewsChannels> newsChannelsList = new ArrayList<>();

    @Override
    public void addChannel(NewsChannels addChannel) {
        newsChannelsList.add(addChannel);
    }

    @Override
    public void removeChannel(NewsChannels removeChannel) {
        newsChannelsList.remove(removeChannel);

    }

    @Override
    public void notifySubsriber(String news) {
        for (NewsChannels n : newsChannelsList) {
            n.update(news);
        }

    }

}