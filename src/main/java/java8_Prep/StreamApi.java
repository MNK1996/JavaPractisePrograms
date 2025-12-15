package java8_Prep;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Double> li = new ArrayList<>();

        li.add(25.0);
        li.add(52.0);
        li.add(42.0);
        li.add(22.0);

        List<Double> l = li.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        l.stream().forEach(x -> System.out.println(x));
        List<Double> count = li.stream().filter(x -> x % 2 == 0).map(x -> x * (0.5)).collect(Collectors.toList());
//                .collect(Collectors.toList())
//                .stream()
//                .forEach(x-> System.out.println("Streams In Single line : "+x));
        System.out.println("Count : " + count);

        List<Object> s = Stream.of(1, "hdajhdak", 33.5).collect(Collectors.toList());
        System.out.println(s);


//        Like this we can do multiple Stream controls
//        ForEach is a terminal Operator it will return nothing
//        Intermediate Operations are lazy eg: map,filter
        List<Integer> lis = Arrays.asList(2, 4, 5, 3);
//       long l3=lis.stream().peek(System.out::println).filter(x->x%2 ==0).peek(x-> System.out.print("AFter filter Function: "+ x+"\t ")).map(i-> i*2).peek(i-> System.out.print("After Map Function: "+i)).filter(i->i>=5).count();
//       System.out.println(l3);
        long ls = 0;
        try {
            if (lis.stream().count() == 0)
                throw new NoSuchElementException("We Dont have any elements in the Arrays stream");
            ls = lis.stream().reduce((a, b) -> a + b).get();
        } catch (NoSuchElementException e) {
            System.out.println("We Dont have such Element: " + e.getMessage());
        }
        System.out.println("Long Stream: " + ls);
        //       .forEach(i-> System.out.println("Terminal Operations : "+i));


        List<Integer> str = Arrays.asList(1, 3, 3, 4, 7, 9, 5, 5, 5);
        Set<Integer> set = new HashSet<>();
        str.stream().limit(5).skip(4).forEach(x -> System.out.println("Limit and Skip : " + x));

        String s1 = "The The Word Which Word Man The Man For Which Love and Enemy";
        List<String> l3 = Arrays.asList(s1.split(" "));
        System.out.println("Result of String in words : " + l3.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
//        System.out.println("AnyMatch : "+str.stream().peek(System.out::println).anyMatch( k->k.equals(5)));
//        str.stream().filter(x -> !set.add(x)).distinct().forEach(System.out::println);

        List<Double> sqRootPrime =Stream.iterate(1, i -> i + 1)
                .filter(x -> x % 2 == 0).peek(System.out::println).map(Math::sqrt).limit(10).collect(Collectors.toList());
        System.out.print(sqRootPrime + "\t");
    }

    public static boolean isPrime(int numb) {
        return numb > 1 && IntStream.range(2, numb).noneMatch(n -> numb % n == 0);
    }

}