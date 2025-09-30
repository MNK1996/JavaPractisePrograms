package DesignPatterns.CreationalDesignPattern.SingletonDesignPattern;


public class Singleton{
    private static Singleton instanceSingleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instanceSingleton;
    }

    public void getHashCode(){
        System.out.println(hashCode());
    }

}