package Discover;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class simple {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("apple","Banana","Avacode",null);

       ls.stream().map(c-> Optional.ofNullable(c).orElse("Random")).filter(c->c.charAt(0)=='A' || c.charAt(0)=='a').collect(Collectors.toList()).forEach(System.out::println);

//2,4
        int ref = 2%2;
String s= String.valueOf(ref);
        System.out.println(s);
        s.equals('0');
        System.out.println(s.equals("0"));
    }

}
