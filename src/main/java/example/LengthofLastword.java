package example;

public class LengthofLastword {
    public static void main(String[] args) {
        String s = "Geeks For Geeks ";
        System.out.println(lengthofLastword(s));
    }
    private static int lengthofLastword(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb.length());
        String[] words = s.split(" ");
        int len =words[words.length-1].length();
        System.out.println(len);
//        for(String word:words.length-1.){
//
//        }
        return 0;
    }
}
