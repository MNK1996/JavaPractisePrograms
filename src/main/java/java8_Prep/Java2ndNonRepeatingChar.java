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
        Map<Character, Long> charCount = s.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        Map.Entry<Character,Long> cm =charCount.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed()).skip(1).findFirst().orElse(null);
        System.out.println(cm.getKey() +" hskhfks "+ cm.getValue());


        /*Another appraoch to get*/

//        Map<Character, Integer> charCount = new LinkedHashMap<>();
//
//        // Count occurrences of each character
//        s.chars().forEach(c -> charCount.put((char) c, charCount.getOrDefault((char) c, 0) + 1));
//
//
//        Character c = charCount.entrySet().stream().filter(entry -> entry.getValue() == 1)
//                .skip(1).map(Map.Entry::getKey).findFirst().orElse(null);

        /*Another way */
        Character c1=charCount.keySet().stream()
                .filter(entry -> charCount.get(entry)==4).findFirst().orElse(null);
        System.out.println("Char c1  : "+c1);

        /* New Problem */

        String[] sch = new String[]{"h", "e", "l", "l", "o"};
        char[] charArray = Arrays.stream(sch).map(d -> d.charAt(0))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString()
                .toCharArray();
//        Arrays.stream().
        System.out.println(charArray);

/* New Problem */
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "IT"),
                new Employee("Eve", "Finance")
        );

        employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()))
                .forEach((department, count) ->
                        System.out.println("Department: " + department + ", Count: " + count));

        /* New Problem */

        List<Department> departments = Arrays.asList(
                new Department("HR", 40),
                new Department("Finance", 30),
                new Department("Engineering", 50),
                new Department("Marketing", 20)
        );

        departments.stream()
                .filter(dept -> dept.getEmployeeCount() > 35)
                .map(Department::getName)
                .toList().forEach(System.out::println);

//        System.out.print("Departments with more than 35 employees: " + result);


        /* New Problem */

        List<Department> seniorPerson = Arrays.asList(
                new Department("Amit", 40),
                new Department("Neel", 30),
                new Department("Rakesh", 50),
                new Department("nani", 20)
        );

       seniorPerson.stream().sorted(Comparator.comparingInt(Department::getEmployeeCount).reversed())
               .skip(1).forEach(e-> System.out.println(e.getEmployeeCount()));
//        System.out.println(op);


        List<String> ls= Arrays.asList("neel","ram","vamsi","vamsi");
        Map<String, Long> collect = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((n,l) -> System.out.println(n+" "+l));
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

