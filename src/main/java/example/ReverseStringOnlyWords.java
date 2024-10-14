package example;

public class ReverseStringOnlyWords {
    public static void main(String[] args) {
        String input = "i.like.this.program.very.much";
        System.out.println(reverseStringOnlyWords(input));
    }

    protected static String reverseStringOnlyWords(String s) {
        String[] st = s.split("\\.");
        /* ---------  1st Approach -----------*/
        /*Input : i.like.this.program.very.much
          Output: much.very.program.this.like.i */
//        Collections.reverse(Arrays.asList(st));
//        return String.join(".", st);

        /* ---------  2nd Approach -----------*/
         /*Input : i.like.this.program.very.much
          Output: much.very.program.this.like.i */
//        StringBuilder reversedString = new StringBuilder();
//        for (int i = st.length - 1; i >= 0; i--) {
//            reversedString.append(st[i]);
//            if (i != 0) {
//                reversedString.append(".");
//            }
//        }
//        return reversedString.toString();


        /* ---------  3rd Approach -----------*/
        /* Input : i.like.this.program.very.much
          Output: much.very.program.this.like.i */
//        String results = "";
//        for (int i = st.length - 1; i >= 0; i--) {
//            //System.out.println("hh: "+ss[i]);
//            if (i == 0) {
//                results = results + st[i];
//            } else {
//                results = results + st[i] + ".";
//            }
//        }
//        return results;

        /* ---------  4th Approach -----------*/
         /*Input : i.like.this.program.very.much
          Output: i.ekil.siht.margorp.yrev.hcum */
//        String reverseString = "";
//        for (String word : st) {
//            String reverseWord = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reverseWord += word.charAt(i);
//            }
//            if (!word.isEmpty()) {
//                reverseString += reverseWord + ".";
//            }
//        }
////        return reverseString.substring(0);
//        return reverseString.substring(0,reverseString.length()-1);
//

        /* ---------  5th Approach -----------*/
        String reverseString = "";
        for (String word : st) {
            String reverseWord = new StringBuffer(word).reverse().toString();
            if (!word.isEmpty()) {
                reverseString += reverseWord + ".";
            }
        }
//        reverseString = reverseString.trim();
        return reverseString.substring(0,reverseString.length()-1);
    }
}
