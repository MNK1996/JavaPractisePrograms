package DesignPatterns.CreationalDesignPattern.AbstractFactory;

public class Engineer implements Profession {

    @Override
    public void print() {
        System.out.println("I am Engineer");
    }
}