package example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharInStringArr {
    public static void main(String[] args) {
        String[] s = {"hello", "apple", "raamp"};


        for (String str : s) {
            HashMap<Character, Integer> hm = new LinkedHashMap<>();
            for (char c : str.toCharArray()) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character, Integer> en : hm.entrySet()) {
                if (en.getValue() == 1) {
                    System.out.print(en.getKey() + " ");
                    break;
                }
            }
        }

    }
}
