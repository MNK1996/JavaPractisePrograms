package example;

public class AddTwoFractions {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int c=7;
        int d=3;
//        addTwoFractions(a,b,c,d);
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3);

    }

    private static void addTwoFractions(int a, int b, int c, int d) {
        int num= (a*d) + (c*b);
        int den= b*d;
        while(num!=0){
            int temp=num;
            num=den%num;
            den=temp;
        }
        int ans= (a*d + c*b)/den;
        System.out.println(ans + "/"+ b*d/den);
    }
}