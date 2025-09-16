package java8_Prep;

public interface FInterface {
    int multiplication(int a, int b);

    long divided(int f, int h);

    static int multiplicon(int a, int b){
        return a*b;
    }

    default int addition(int a, int b){
        return a+b;
    }
}

