package example;

import java.util.HashMap;
import java.util.HashSet;

public class StringStartingWithSingleChar {
    public static void main(String[] args) {
        String[] s= {"Search", "search", "note", "Sample", "apple", "sample","note"};

        HashSet<String> hs= new HashSet<>();
        for (int i=0;i<s.length;i++){
            if(s[i].toLowerCase().charAt(0)=='s'){
//                System.out.println(s[i]);
                hs.add(s[i].toUpperCase());
            }
        }
        System.out.println(hs);

    }
}
