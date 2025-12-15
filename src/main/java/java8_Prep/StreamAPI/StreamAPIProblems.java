package java8_Prep.StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIProblems {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        List<Integer> sortedNumbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNumbers); // Output: [5, 4, 3, 2, 1]


        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
//        names.stream().peek(System.out::println)
//                .filter(name -> name.startsWith("A")).forEach(System.out::print);
//                .count();
//        System.out.println(count); // Output: 3


        names.stream().map(s -> s.concat("jhj")).forEach(System.out::println);


        String input = "swiss";
        Optional<Character> firstNonRepeated = input.chars().mapToObj(c -> (char) c).filter(c -> input.indexOf(c) == input.lastIndexOf(c)).findFirst();
        System.out.println("swiss nonrepeated: "+firstNonRepeated.orElse(null)); // Output: w

        System.out.println(input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null));


        List<Integer> maxInt = Arrays.asList(10, 20, 30, 40, 50);
        int maxNumber = maxInt.stream().max(Integer::compare).orElseThrow();
        System.out.println(maxNumber); // Output: 50

        List<String> anyMatchstrings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean containsAPI = anyMatchstrings.stream().anyMatch(s -> s.contains("API"));
        System.out.println(containsAPI); // Output: true

        List<Integer> numbersDuplicate = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = numbersDuplicate.stream().filter(n -> !unique.add(n)).collect(Collectors.toSet());
        System.out.println(duplicates); // Output: [1, 2]

        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer, List<String>> groupedByLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
        // Output: {3=[API], 4=[Java, Code, Fun], 6=[Stream]}


        List<String> wordsHighestLength = Arrays.asList("Java", "Stream", "API", "Development");
        String longest = wordsHighestLength.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse(null);
        System.out.println(longest); // Output: Development


        List<Integer> intHighestValue = Arrays.asList(10,40,2983,182,812);
        System.out.println(intHighestValue.stream().reduce((int1,int2)-> int1 > int2 ? int1 : int2).stream().toList());


        String inputCount = "success";
        Map<Character, Long> frequency = inputCount.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(frequency); // Output: {s=3, u=1, c=2, e=1}


        List<String> wordsPalindrome = Arrays.asList("radar", "level", "world", "java");
        List<String> palindromes = wordsPalindrome.stream()
                .filter(word -> !word.equals(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(palindromes); // Output: [radar, level]


        List<String> wordsReverse = Arrays.asList("Java", "Stream", "API");
        List<String> reversedWords = wordsReverse.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversedWords); // Output: [avaJ, maertS, IPA]









    }
}