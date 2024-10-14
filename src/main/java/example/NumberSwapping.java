package example;

public class NumberSwapping {
    public static void main(String[] args) {
        int a = 45, b = 99;
        System.out.println(swapNumber(a, b));
    }

    private static String swapNumber(int a, int b) {
        /* ---------  1st Approach -----------*/
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        /* ---------  2nd Approach -----------*/
        a = a + b; //10+20 =30
        b = a - b; //30-20=10=b
        a = a - b; //30-10=20

        /* ---------  3rd Approach -----------*/
        a = a * b; //10*20 =200
        b = a / b; //200/20=10
        a = a / b; //100/10=20

        /* ---------  4th Approach -----------*/
        a = a ^ b; //10 ^ 20 =30
        b = a ^ b; //30 ^ 20 =10 = b
        a = a ^ b; //30 ^ 10 =20 = a

        /* ---------  5th Approach -----------*/
        b = a + b - (a = b);

        return "a = " + a + " and b = " + b;
    }
}
