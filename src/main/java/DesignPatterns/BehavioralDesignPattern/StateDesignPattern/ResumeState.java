package DesignPatterns.BehavioralDesignPattern.StateDesignPattern;

public class ResumeState implements PlayerState {
    @Override
    public void pressPlay(VideoPlayer player) {
        System.out.println("Already Playing Resuming now");
        player.setPlayerState(new StoppedState());
    }
}