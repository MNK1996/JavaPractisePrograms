package DesignPatterns.BehavioralDesignPattern.StateDesignPattern;

public class PlayingState implements PlayerState {
    @Override
    public void pressPlay(VideoPlayer player) {
        System.out.println("Playing Video");
        player.setPlayerState(new ResumeState());
    }
}