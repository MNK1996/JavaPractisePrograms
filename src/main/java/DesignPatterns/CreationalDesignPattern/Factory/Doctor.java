package DesignPatterns.CreationalDesignPattern.Factory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am a Doctor");
    }
}