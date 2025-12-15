package java8_Prep;

import java.util.LinkedHashMap;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Java2ndNonRepeatingChar {
    public static void main(String[] args)
// 1.Java 8 code to get the 2nd non repeating char from string using streams
    {
        String s = "adxdadaddat";
        System.out.println(s.chars().mapToObj(c -> (char) c).distinct().toList().get(2));
        Map<Character,Long> groupChar = s.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(groupChar);
//        System.out.println(groupChar.keySet().stream().skip(1).findFirst().orElse(null));
//        Map.Entry<Character,Long> cm =charCount.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed()).skip(1).findFirst().orElse(null);
//        System.out.println(charCount);


        /*Another appraoch to get*/

        Map<Character, Integer> charCount1 = new LinkedHashMap<>();

        // Count occurrences of each character
        s.chars().forEach(c -> charCount1.put((char) c, charCount1.getOrDefault((char) c, 0) + 1));


//
//        Character c = charCount.entrySet().stream().filter(entry -> entry.getValue() == 1)
//                .skip(1).map(Map.Entry::getKey).findFirst().orElse(null);

        /*Another way */
//        Character c1=charCount.keySet().stream()
//                .filter(entry -> charCount.get(entry)==4).findFirst().orElse(null);
////        System.out.println("Char c1  : "+c1);

        /* New Problem */

        String[] sch = new String[]{"h", "e", "l", "l", "o"};
        System.out.println(Arrays.stream(sch).collect(Collectors.joining()));

        char[] charArray = Arrays.stream(sch).map(d -> d.charAt(0))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString()
                .toCharArray();
//        Arrays.stream().
        System.out.println("ahshj");
        System.out.println(charArray);

        /* New Problem */
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "IT"),
                new Employee("Eve", "Finance")
        );

       LinkedList<String> ls= employees.stream().map(e -> e.name+ " : "+ e.name.length()).collect(Collectors.toCollection(LinkedList::new));
//        System.out.println(ls.stream().skip(1).toList());
//        employees.stream().map(e-> e.name+" : "+e.name.length()).forEach(System.out::println);

//        Collections.reverse(ls);
//        ls.forEach(System.out::println);
     /*   employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()))
                .forEach((department, count) ->
                        System.out.println("Department: " + department + ", Count: " + count));
*/
        /* New Problem */

        List<Department> departments = Arrays.asList(
                new Department("HR", 40),
                new Department("Finance", 30),
                new Department("Engineering", 50),
                new Department("Marketing", 20)
        );

/*          departments.stream()
                .filter(dept -> dept.getEmployeeCount() > 35)
                .map(Department::getName)
                .toList().forEach(System.out::println);
*/
//        System.out.print("Departments with more than 35 employees: " + result);


        /* New Problem */

        List<Department> seniorPerson = Arrays.asList(
                new Department("Amit", 40),
                new Department("Neel", 30),
                new Department("Rakesh", 50),
                new Department("nani", 20)
        );

//        seniorPerson.stream().sorted().skip(1).forEach(System.out::println);

//       seniorPerson.stream().sorted(Comparator.comparingInt(Department::getEmployeeCount).reversed())
//               .skip(1).forEach(e-> System.out.println(e.getEmployeeCount()));
//        System.out.println(op);

       List<Department> departmentsWithName = seniorPerson.stream().filter(d -> d.getName().startsWith("N")).toList();

       for(Department d : departmentsWithName){
//           System.out.println("Employee Name with count : "+d.getName() +" With the name  "+ d.getEmployeeCount());
       }

       List<String> countOfString= Arrays.asList("neel","ram","vamsi","vamsi");
       Map<String, Long> collect = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        collect.forEach((n,l) -> System.out.println(n+" "+l));
        Map<String, Long> countodf=countOfString.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

//        System.out.println(countodf);
        List<Integer> i= ls.stream().map(String::length).collect(Collectors.toList());
//        System.out.println("Count Of Each Word : "+i);

        String stringReverse ="Neel is a Neel boy is is"; // leeN si a doog yob
        String[] st = stringReverse.split(" ");


        Map<String, Long> countString =Arrays.stream(st).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Stream<Map.Entry<String, Long>> countS =countString.entrySet().stream()
                .sorted(Comparator.comparingInt((Map.Entry<String, Long> e) -> e.getKey().length()).reversed());


        System.out.println(countS.toList());
//        Arrays.stream(st).map(word -> new StringBuilder(word).reverse().toString()).map(word -> word+" ").forEach(System.out::print);

    }
}


class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class Department {
    String name;
    int employeeCount;

    Department(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }
}