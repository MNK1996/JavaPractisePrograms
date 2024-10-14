package example;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
//        String s = "i.like.this.program.very.much";
        String s = "I am Neel. I love Java!";
        System.out.println(s + " : Actual Text");
        reverseWords(s);
    }

    private static void reverseWords(String input) {
//        String[] words = input.split("\\.");
        String[] words = input.split(" ");
        String reversedString = "";

        /* ---------- To Reverse each word with reversing the sentence ----------- */
        /* ---------  1st Approach -----------*/
        /* Input : "I am Neel. I love Java!"
          Output: I ma .leeN I evol !avaJ */
//        StringBuilder reversedString = new StringBuilder();
//        for (String word : words) {
//            String reversedWord = new StringBuilder(word).reverse().toString();
//            reversedString.append(reversedWord).append(" ");
//        }
//        System.out.println(reversedString + " : To Reverse each word with reversing the sentence 1st Approach");


        /* ---------  2nd Approach -----------*/
        /*Input : "I am Neel. I love Java!"
          Output: I ma .leeN I evol !avaJ */

//        for (String word : words) {
//            String reversedWord = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reversedWord = reversedWord + word.charAt(i);
//            }
////            reversedString += reversedWord + ".";
//            reversedString += reversedWord + " ";
//        }
//        reversedString=reversedString.substring(0,reversedString.length()-1);
//        System.out.println(reversedString + ": To Reverse each word with reversing the sentence 2nd Approach");

        /* ---------- To Reverse Whole String ----------- */
        /* ---------  1st Approach -----------*/
        /* Input : "I am Neel. I love Java!"
           Output: "!avaJ evol I .leeN ma I"  */
//        reversedString = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversedString = reversedString + input.charAt(i);
//        }
//        System.out.println(reversedString + " : To Reverse Whole String 1st Approach");

        /* ---------  2nd Approach -----------*/
//        reversedString = new StringBuilder(input).reverse().toString();
//        System.out.println(reversedString + " : To Reverse Whole String 2nd Approach");
//        return reversedString.toString().trim();

        /* ---------  3nd Approach -----------*/
//        StringBuffer sb = new StringBuffer(input);
//        System.out.println(sb.reverse());

    }
}