package example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionsMain implements Neela {
    public static void main(String[] args) throws Exception {
        ReflectionsCat rc = new ReflectionsCat("Neel", 29);

        System.out.println(rc.neelakantam());
//        System.out.println(rc.getName() + " " + rc.getAge());
        Field[]  fields = rc.getClass().getDeclaredFields();
        for (Field f : fields)
            if (f.getName().equals("name")) {
                f.setAccessible(true);
                f.set(rc, "Sai");
            }
//        System.out.println(rc.getName());
        Method[] m = rc.getClass().getDeclaredMethods();
        for (Method mc : m) {
            try{
                if (mc.getName().equals("getName")) {
//                mc.setAccessible(true);
                    mc.invoke(rc);
                    System.out.println(mc.getName());
                }
            }
            catch (IllegalAccessException e){
                System.out.println("Don't have access");
            }

            //            System.out.println("trySetAccessible : "+mc.trySetAccessible());

        }
        Neela n = new Neela() {
            @Override
            public String neelakantam() {
                return "Neel in sublace Interface Object";
            };

        };

        Neela d= new ReflectionsMain();
        System.out.println(d.neelakantam());
//        String s = n.neelakantam();
//        System.out.println(s);

        Runnable run;

        Comparable<Integer> co;



    }

    @Override
    public String neelakantam() {
        System.out.println("Neel method from Main ");

        return null;
    }
}
