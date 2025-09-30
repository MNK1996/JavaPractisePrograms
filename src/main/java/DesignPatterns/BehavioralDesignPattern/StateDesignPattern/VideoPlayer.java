package DesignPatterns.BehavioralDesignPattern.StateDesignPattern;

public class VideoPlayer {
    private PlayerState state;

    public VideoPlayer(){
        state = new StoppedState();
    }

    public void setPlayerState(PlayerState state){
        this.state = state;
    }

    public void pressPlay(){
        state.pressPlay(this);
    }

}