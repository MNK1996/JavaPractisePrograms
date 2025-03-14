package example;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class RemoveDupWords {
    public static void main(String[] args) {
        String str="Geeks for Geeks is for the Coding and Coding for";

        StringTokenizer st=new StringTokenizer(str);
        Set<String> s= new HashSet<>();

        while(st.hasMoreTokens()){
            String word = st.nextToken();
            while (!s.contains(word)){
                System.out.print(word+ " ");
                s.add(word);
            }
        }
//
//        System.out.println(s);

    }
}
