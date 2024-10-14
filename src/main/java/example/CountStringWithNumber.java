package example;

public class CountStringWithNumber {
    public static void main(String[] args) {
        String str = "57"; // geeks3 -> geeks=5 then
        System.out.println(countStringWithNumber(str));
    }

    private static int countStringWithNumber(String num) {
        int n = 0;
        int cnt = 0;
//        for (int i = 0; i < num.length(); i++) {
//            char c = num.charAt(i);
//            if (Character.isLetter(c)) {
//                cnt++;
//            } else if (Character.isDigit(c)) {
//                n = (n * 10) + (c - '0');
//            }
//        }
//        return n == cnt ? 1 : 0;

        for (int i=0;i<num.length();i++){
            System.out.println(num.charAt(i));
            if (num.charAt(i) >= 0 || num.charAt(i) <=9){
                System.out.println(n +" - 1st " + num.charAt(i));
                n=n+ (int)num.charAt(i);
                System.out.println(n +" - 2nd " + num.charAt(i));
            }
        }
        return n;
    }
}
