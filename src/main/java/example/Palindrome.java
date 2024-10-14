package example;

public class Palindrome {
    public static void main(String[] args) {
        int input=12321;
        System.out.println(palindromeForNumbers(input));
    }
    private static String palindromeForNumbers(int input){
        int rec_num=input;
        int rev=0;
        while(input!=0){
            rev=rev*10+input%10;
            input/=10;
        }
        if (rec_num==rev){
            return rec_num + " Palindrome";
        }
        else {
            return rec_num + " Not Palindrome";
        }
    }
}
