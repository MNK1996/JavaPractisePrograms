package Discover;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewDiscussion {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Java","Hibernate", null, null);

        List<String> str1= Arrays.asList(("The The Way way of of you").split(" "));
        for (String s: str){
            s.split("");

        }


        System.out.println("List : "+(str1.stream().filter(c -> c !=null).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))));

        int[] array ={1,2,4,5,9,6,7,8,3,9,10};
        Arrays.sort(array);


        System.out.println(Arrays.stream(array).skip(1).findFirst());

    }
}