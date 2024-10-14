package example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        String s = "I am Neel. I love Java!";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String input) {
//        String[] words = input.split(" ");
        String reversedString = "";

        /* ---------- To Reverse each word with reversing the sentence ----------- */
        /* ---------  1st Approach -----------*/
        /*Input : "I am Neel. I love Java!"
          Output: I ma .leeN I evol !avaJ */
//        StringBuilder reversedString = new StringBuilder();
//        for (String word : words) {
//            String reversedWord = new StringBuilder(word).reverse().toString();
//            reversedString.append(reversedWord).append(" ");
//        }


        /* ---------  2nd Approach -----------*/
        /*Input : "I am Neel. I love Java!"
          Output: I ma .leeN I evol !avaJ */

//        for (String word : words) {
//            String reversedWord = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reversedWord = reversedWord + word.charAt(i);
//            }
//            reversedString = reversedString + reversedWord + " ";
//        }

        /* ---------- To Reverse Whole String ----------- */
        /* ---------  1st Approach -----------*/
        /* Input : "I am Neel. I love Java!"
           Output: "!avaJ evol I .leeN ma I"  */
//        for(int i=input.length()-1;i>=0;i--){
//            reversedString=reversedString+input.charAt(i);
//        }

        /* ---------  2nd Approach -----------*/
        reversedString = new StringBuilder(input).reverse().toString();

        return reversedString.toString().trim();
    }
}