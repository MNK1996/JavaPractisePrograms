package Java17;
record Alien(int id, String name){

}
public class RecordClasses  {
    public static void main(String[] args) {
        var al = new Alien(1, "Neel");
        var al1 = new Alien(1, "Neel");


        System.out.println(al.name());
        System.out.println(al1.equals(al));

        String s= """
                Neel the dev.
                he have 5yrs of Experience...
                In Various Tech Stack
                """;
        System.out.println(s);

    }
}