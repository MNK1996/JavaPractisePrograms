package DSA;

import java.util.HashMap;

public class PointersAndClasses {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1= new HashMap<>();
        HashMap<String, Integer> hm2= new HashMap<>();

        hm1.put("Values", 11);
        hm2 = hm1;
        hm1.put("Values", 12);
        hm2.put("Values",55);
        System.out.println("hm1 : "+ hm1.hashCode() +hm1 +"\n" +"hm2 : "+hm2.hashCode() +hm2 );

    }
}
