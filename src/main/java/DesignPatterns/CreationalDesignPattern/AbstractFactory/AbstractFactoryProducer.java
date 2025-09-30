package DesignPatterns.CreationalDesignPattern.AbstractFactory;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfessions(Boolean ifTrainee){
        if (ifTrainee){
           return new TraineeProfAbstractFactory();
        }
        else {
           return new ProfessionAbstractFactory();
        }
    }
}