package example;

import java.util.*;

public class RemoveDupWords {
    public static void main(String[] args) {
        String str="Geeks for Geeks is for the Coding and Coding for";
        /* ---------  1st Approach -----------*/
//        StringTokenizer st=new StringTokenizer(str);
//        Set<String> s= new HashSet<>();
//
//        while(st.hasMoreTokens()){
//            String word = st.nextToken();
//            while (!s.contains(word)){
//                System.out.print(word+ " ");
//                s.add(word);
//            }
//        }

        /* ---------  2nd Approach -----------*/
        Set<String> set = new LinkedHashSet<>();
        String[] s1 = str.split("\\ ");
        for (String s : s1) {
            set.add(s);
        }
        for (String s : set) {
            System.out.print(s + " ");

        }



    }
}
