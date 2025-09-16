package example;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMain{
    void street(){
        System.out.println("Street Method");
    }
    public static void main(String[] args) {
        new ComparatorMain().street();
        ComparatorAndComparableEmployee[] cce = new ComparatorAndComparableEmployee[4];
        cce[0] = new ComparatorAndComparableEmployee(99,"Amit");
        cce[1] = new ComparatorAndComparableEmployee(89,"Amit");
        cce[2] = new ComparatorAndComparableEmployee(43,"Zaggi");
        cce[3] = new ComparatorAndComparableEmployee(0,"Junnu");
//        cce[4] = new ComparatorAndComparableEmployee(32,"Raanu");
//        Arrays.sort(cce);

        Comparator<ComparatorAndComparableEmployee> nameComp= Comparator.comparing(ComparatorAndComparableEmployee::getName).reversed().thenComparingInt(s->s.getId());
        Arrays.sort(cce, nameComp);

        System.out.println("Arrays of Employee : "+Arrays.toString(cce));
        Arrays.sort(cce, ComparatorAndComparableEmployee.Employee);
        System.out.println(Arrays.toString(cce));
    }
}