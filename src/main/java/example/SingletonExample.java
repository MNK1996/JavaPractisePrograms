package example;

import jdk.dynalink.linker.LinkerServices;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton s = new Singleton();
        s.singleton();
        s.singleton();

    }
    public static class Singleton{
        Singleton instance;
      void singleton(){
           if (instance==null){
               instance=new Singleton();
               System.out.println("New instance created");
           }
           else {
               System.out.println("No instance created");
           }
       }


    }

}

