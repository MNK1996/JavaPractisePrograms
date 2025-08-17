package example;

interface Neela{
    public String neelakantam();
}

public class ReflectionsCat implements Neela{
    private final String name;
    private int age;


    public ReflectionsCat(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getPublicVoid(){
        System.out.println("Inside getPublicVoid");
    }

    public static void getPublicStatic(){
        System.out.println("Inside getPublicStatic");
    }
    private static void getPrivateStatic(){
        System.out.println("Inside getPrivateStatic");
    }

    @Override
    public String neelakantam() {
        System.out.println("SubClass Neelakantam Method");
        return null;
    }
}
