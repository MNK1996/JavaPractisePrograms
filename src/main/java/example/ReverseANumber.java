package example;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = 14786;
        System.out.println(reverseNumber(number));
    }

    private static StringBuilder reverseNumber(int num) {
        /* ---------  1st Approach -----------*/
//        int ref = 0;
//        while (num != 0) {
//            ref = ref * 10 + num % 10;
//            num = num / 10;
//        }
//        return ref;

        /* ---------  2nd Approach -----------*/
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        sb.reverse();
//        return sb;

        /* ---------  3rd Approach -----------*/
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.reverse();
        return sb;

    }
}
