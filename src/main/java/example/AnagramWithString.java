package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class AnagramWithString {
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";
        long res1 = 0,res2=0;
        String s = "geeksForGeeks";

        HashMap<String, Integer> hm= new HashMap<>();
//        Stream<String> st= List.of(a.charAt(a))

       anagram(a,b);

//
//        for (int i=0;i<a.length()-1;i++){
//            char ch= a.charAt(i);
//            System.out.println(Integer.valueOf(ch-'a'));
//            res1+= (ch-'a'+1)*Math.pow(2,ch-'a'+1);
//            System.out.println("res1 : "+res1);
//        }
//        for (int i=0;i<b.length()-1;i++){
//            char ch= b.charAt(i);
//            res2+= (ch-'a'+1)*Math.pow(2,ch-'a'+1);
//            System.out.println("res2 : "+res2);
//        }
//        if (res1 == res2){
//            System.out.println(true);
//        }
//        System.out.println(7*Math.pow(2,7));
////        System.out.println(res);
//        anagramWithString(a, b);
    }

    /* ---------  1st Approach -----------*/
//    private static boolean anagram(String a, String b) {
//        if (a.length()!=b.length()) return false;
//        char[] ch1= a.toCharArray();
//        char[] ch2= b.toCharArray();
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//        return Arrays.equals(ch1,ch2);
//    }

    /* ---------  2nd Approach -----------*/
    private static boolean anagram(String a, String b) {
        List<Character> l1= new ArrayList<>();
        List<Character> l2= new ArrayList<>();
        for (char ch:a.toCharArray()) l1.add(ch);
        for (char ch:b.toCharArray()) l2.add(ch);
        return l1.equals(l2);
        }



    /* ---------  3rd Approach -----------*/
//    private static void anagramWithString(String a, String b) {
//        HashMap<String, Integer> hm = new HashMap<>();
//        int count = 0;
//        for (int i = a.length() - 1; i >= 0;i--) {
//            for (int j = i; j <= i; j--) {
//                if (a.charAt(i) == a.charAt(j)) {
//                    count++;
//                }
//            }
//            hm.put(String.valueOf(a.charAt(i)), count);
//        }
//        System.out.println(hm.size());
//        System.out.println(hm.clone());
//    }
}
