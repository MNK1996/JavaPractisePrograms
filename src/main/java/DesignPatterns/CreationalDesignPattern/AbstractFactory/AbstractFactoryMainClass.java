package DesignPatterns.CreationalDesignPattern.AbstractFactory;

public class AbstractFactoryMainClass {
    public static void main(String[] args) {
        AbstractFactory af = AbstractFactoryProducer.getProfessions(false);

        Profession p = af.getProfession("Engineer");
        p.print();
    }
}