package DesignPatterns.BehavioralDesignPattern.StateDesignPattern;

public class StoppedState implements PlayerState {

    @Override
    public void pressPlay(VideoPlayer player) {
        System.out.println("Playing Video Stopper State");
        player.setPlayerState(new PlayingState());


    }
}