package DesignPatterns.CreationalDesignPattern.Prototype;

import javax.print.Doc;
import java.util.Hashtable;

public class ProfessionCache {
    private static Hashtable<Integer, Profession> professionMap = new Hashtable<>();

    public static Profession getCloneNewProfession(int id){
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }

    public static void loadProfessionCache(){
        Doctor d = new Doctor();
        d.id = 1;
        professionMap.put(d.id,d);

        Engineer e = new Engineer();
        e.id=2;
        professionMap.put(e.id,e);

        Teacher t = new Teacher();
        t.id=3;
        professionMap.put(t.id,t);
    }
}