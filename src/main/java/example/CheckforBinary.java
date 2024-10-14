package example;

public class CheckforBinary {
    public static void main(String[] args) {
        String s = "60";
        System.out.println(checkforBinary(s));
    }

    private static boolean checkforBinary(String str) {
        boolean b = false;
        for (int i = str.length() - 1; i > 0; i--) {
            System.out.println(str.charAt(i));
            if (str.charAt(i) == '0' || str.charAt(i) == '1') {
                System.out.println("inside the if condition : "+str.charAt(i));
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }
}
// 00 0
// 01 1
// 10 2
// 11 3
//000 4
//001 5
//010 6
//011 7
//01100
