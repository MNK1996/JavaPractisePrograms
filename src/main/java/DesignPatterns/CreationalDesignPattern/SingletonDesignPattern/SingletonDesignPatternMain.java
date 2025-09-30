package DesignPatterns.CreationalDesignPattern.SingletonDesignPattern;

public class SingletonDesignPatternMain {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        s.getHashCode();
        s1.getHashCode();


    }
}