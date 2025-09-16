package DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class ProfessionFactory {

    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        }
        if (typeOfProfession.equalsIgnoreCase("Doctor")) {
            return new Doctor();
        }
        if (typeOfProfession.equalsIgnoreCase("Lawer")) {
            return new Lawer();
        }
        if (typeOfProfession.equalsIgnoreCase("SoftwareDev")) {
            return new SoftWareDev();
        }
        return null;
    }

}