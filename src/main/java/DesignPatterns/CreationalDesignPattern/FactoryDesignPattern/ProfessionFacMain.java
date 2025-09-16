package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class ProfessionFacMain {
    public static void main(String[] args) {
        ProfessionFactory pf = new ProfessionFactory();
        Profession p = pf.getProfession("Doctor");
        Profession p1 = pf.getProfession("Lawer");
        Profession p2 = pf.getProfession("SoftwareDev");

        p.print();
        p1.print();
        p2.print();
    }
}