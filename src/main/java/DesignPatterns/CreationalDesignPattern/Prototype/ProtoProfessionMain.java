package DesignPatterns.CreationalDesignPattern.Prototype;

public class ProtoProfessionMain {
    public static void main(String[] args) {

        ProfessionCache.loadProfessionCache();

        Profession d = ProfessionCache.getCloneNewProfession(1);
        Profession e = ProfessionCache.getCloneNewProfession(2);
        Profession t = ProfessionCache.getCloneNewProfession(3);
        Profession t1 = ProfessionCache.getCloneNewProfession(3);

        d.print();
        e.print();
        t.print();
        t1.print();
    }
}