package example;

import java.util.Comparator;



public class ComparatorAndComparableEmployee implements Comparable<ComparatorAndComparableEmployee> {

    private int id;
    private String name;

    public ComparatorAndComparableEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(ComparatorAndComparableEmployee o) {
        return this.id + o.id;
    }

    static Comparator<ComparatorAndComparableEmployee> Employee =
            Comparator.comparing(ComparatorAndComparableEmployee::getName).thenComparingInt(ComparatorAndComparableEmployee::getId);
}