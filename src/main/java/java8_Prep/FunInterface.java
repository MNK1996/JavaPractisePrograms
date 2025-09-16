package java8_Prep;

public class FunInterface implements FInterface {
    public static void main(String[] args) {

        FInterface f = new FunInterface();
        System.out.println(f.divided(4,5));
        System.out.println(FInterface.multiplicon(5,7));
        System.out.println(f.addition(4,5));
    }

    @Override
    public int multiplication(int a, int b) {

        return a*b;
    }

    @Override
    public long divided(int f, int h) {
        return f/h;
    }

    static int multiplicon(int a, int b){
       return a+b;
    }

    @Override
    public int addition(int a, int b) {
        System.out.println("In FunInterface addition Override : "+FInterface.super.addition(a, b));
        return FInterface.super.addition(a, b);
    }
}