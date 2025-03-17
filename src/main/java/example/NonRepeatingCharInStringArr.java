package example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class NonRepeatingCharInStringArr {
    public static void main(String[] args) {
       String[] s2={"hello", "apple","raamp"};

        HashMap<Character,Long> hm= new LinkedHashMap<>();


        for (int i=0;i<s2.length;i++){
            char[] c= s2[i].toCharArray();
            for (int j=0;j<c.length-1;j++){
                long n=1;
                if(!hm.containsKey(c[j])) {
                    hm.put(c[j], n);
                } else if (hm.containsKey(c[j])){
                    hm.put(c[j], hm.get(c[j]) + 1);
                }
            }
            System.out.println(hm.entrySet());
        }

    }
}
