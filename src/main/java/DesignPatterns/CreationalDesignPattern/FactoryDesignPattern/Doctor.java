package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am a Doctor");
    }
}