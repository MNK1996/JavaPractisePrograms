package example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;



public class Exceptions {

    public static void main(String[] args) {
        BufferedReader br = null;
        int i = 0;
        int j = 0;
        int[] k = new int[5];
        List<Exception> exceptions = new ArrayList<>();

        try{
            if(i==0)
                throw new  CustomException("Neel");
        }catch (CustomException c){
            System.out.println("From Catch Block : "+c);
        }

        try {
            System.out.print("Enter the value : ");
            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                j = Integer.parseInt(br.readLine());
                System.out.println("The entered Number : " + j);
            } catch (Exception e) {
                exceptions.add(new Exception("Input parsing error: " + e));
            }

            try {
                if (i == 0)
                    throw new NeelExceptionIntI("Please give 0<n in value of i");
            } catch (NeelExceptionIntI ni) {
                exceptions.add(ni);
            }

            try {
                j = 18 / i;
            } catch (ArithmeticException ae) {
                exceptions.add(new Exception("Arithmetic error: " + ae));
            }

            try {
                if (j == 0)
                    throw new NeelException("Denominator is More than Numerator - If Block");
            } catch (NeelException n) {
                exceptions.add(n);
            }

            try {
                System.out.println(k[5]); // ArrayIndexOutOfBoundsException
            } catch (Exception e) {
                exceptions.add(new Exception("Array access error: " + e));
            }

        } catch (Exception e) {
            exceptions.add(new Exception("General error: " + e));
        }

// Print all collected exceptions
        for (Exception ex : exceptions) {
            System.out.println("Caught Exception: " + ex);
        }

    }


}