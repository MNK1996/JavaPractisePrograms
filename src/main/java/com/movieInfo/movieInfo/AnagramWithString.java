package com.movieInfo.movieInfo;

import java.util.HashMap;

public class AnagramWithString {
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";
        long res1 = 0,res2=0;
        String s = "geeksForGeeks";
        for (int i=0;i<a.length()-1;i++){
            char ch= a.charAt(i);
            System.out.println(Integer.valueOf(ch-'a'));
            res1+= (ch-'a'+1)*Math.pow(2,ch-'a'+1);
            System.out.println(res1);
        }
        for (int i=0;i<b.length()-1;i++){
            char ch= b.charAt(i);
            res2+= (ch-'a'+1)*Math.pow(2,ch-'a'+1);
        }
        if (res1 == res2){
            System.out.println(true);
        }
        System.out.println(7*Math.pow(2,7));
//        System.out.println(res);
//        anagramWithString(a, b);
    }

    private static void anagramWithString(String a, String b) {
        HashMap<String, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = a.length() - 1; i >= 0;i--) {
            for (int j = i; j <= i; j--) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }
            hm.put(String.valueOf(a.charAt(i)), count);
        }
        System.out.println(hm.size());
        System.out.println(hm.clone());
    }
}
