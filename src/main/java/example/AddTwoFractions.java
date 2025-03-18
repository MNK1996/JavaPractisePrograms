package example;

public class AddTwoFractions {
    public static void main(String[] args) {
        int i= 3;
        int b=4;
        int c=7;
        int d=3;
        addTwoFractions(i,b,c,d);
    }

    private static void addTwoFractions(int a, int b, int c, int d) {
        int num= (a*d) + (c*b);
        int den= b*d;


        int sum= num/den;
        System.out.println(num + "/"+ den);

    }
}
