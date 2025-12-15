package java8_Prep;

import java.util.function.BiFunction;

public class LambdaDivide {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> divide = (n1, n2) -> n1 / (double) n2;


        int n1 = 10;
        int n2 = 2;
        Double result = divide.apply(n1, n2);

        System.out.println("Result: " + result);
    }
}