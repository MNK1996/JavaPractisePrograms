package java8_Prep;

import java.util.Date;
import java.util.function.*;

public class DeFaultInterfaceInJava8 {
    public static void main(String[] args) {
        /**   Predicate Input will be anything
         *              Output will be Boolean **/
        Predicate<String> p = i -> i.length() >= 5;
        System.out.println("Predicate : " + p.test("Code Decoder"));
        /** Predicate Joining  i. And
         *                     ii. or
         *                     iii. negate **/

        Predicate<String> pr = i -> (i.length() % 2 == 0);
        System.out.println("Predicate Joining : " + p.and(pr).test("Code Decode"));

        /** Bi-Predicate **/
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) >= 5;
        System.out.println("BiPredicate : " + biPredicate.test(4, 9)); //


        /**   Function Interface Input will be anything
         *                       Output will be Anything
         *    It will do the operations **/

        Function<Integer, Integer> f = i -> i * i;
        System.out.println("Function Interface : " + f.apply(5));
        /**   Function Chaining -> reference1.addThen(reference2).apply(T t);
         *                         reference1.compose(reference2).apply(T t);  **/
        Function<Integer, Integer> fChaining = i -> i + i;
        System.out.println("Function Interface Chaining : " + fChaining.andThen(f).apply(2));
//        first fChaining will execute then f will execute
        fChaining.compose(f).apply(5);
//        here f will execute first then fChaining will execute

        /**   Bi-Function **/
        BiFunction<Integer, Integer, Integer> biFun = (a, b) -> a * b;
        Function<Integer, Integer> biFChaning = (a) -> a * 2;
        System.out.println("Bi-Function : " + biFun.apply(4, 3));
        System.out.println("Bi-F Chaining : " + biFun.andThen(biFChaning).apply(3, 4));


        /** Consumer Only Consumes not give any return Type **/
        /**   Consumer -> .accept(T t)  It wont give any output it will only take Input **/
        Consumer<Integer> c = i -> System.out.println("In Consumer Interface :" + i * i);
        c.accept(5);

        /**   Consumer Chaining  **/
        Consumer<Integer> dc = i -> System.out.println("In Consumer Chaining Interface dc :" + 2 * i);
        c.andThen(dc).accept(5);

        /**   Bi-Consumer Chaining  **/
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("In Bi-Consumer :" + (a + b));
        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> System.out.println("In Bi-Consumer Chaining :" + (a * b));
        biConsumer.andThen(biConsumer1).accept(4, 6);


        /**  Supplier **/
        Supplier<Date> supplier = () -> new Date();
//        Supplier supplier1 =() -> 5+5;

        System.out.println("Supplier : " + supplier.get());


    }
}
