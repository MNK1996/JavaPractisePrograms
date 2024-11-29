package mastercard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sampleClass {
    public static void main(String[] args) {
//        10,20,30,20,40,90
        List<Integer> num= Arrays.asList(10,20,30,20,40,90);
        List<Integer> dup= num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue() >1)
                .map(Map.Entry::getKey)
                .findFirst()
                .stream()
                .collect(Collectors.toList());
        System.out.println("Duplicate Elements:"+ dup);

    }
}
