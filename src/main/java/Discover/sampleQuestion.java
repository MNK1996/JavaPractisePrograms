package Discover;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class sampleQuestion {

    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        num.stream().filter(n -> n%2==0).toList().forEach(n-> System.out.print(n +" "));
        System.out.println();
        num.stream().filter(n -> n%2!=0).toList().forEach(n-> System.out.print(n +" "));
        System.out.println();

        String s= "Hello";
        List<Character> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.reverse(collect);
        System.out.println(collect);

    }
}