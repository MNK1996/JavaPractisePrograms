package example;

public class SumOfTwolargeNumbers {
    public static void main(String[] args) {
        String s1 = "34";
        String s2 = "34";
        System.out.println(sumOfTwolargeNumbers(s1, s2));
    }

    private static String sumOfTwolargeNumbers(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int lenX = X.length() - 1;
        int lenY = Y.length() - 1;
        int carry = 0;
        //0=48
        //1=49
        //2=50
        //3=51
        while (lenX >= 0 || lenY >= 0) {
            System.out.println("lenX : " + lenX);
            int unitX = 0;
            if (lenX >= 0) {
                unitX = X.charAt(lenX) - '0';
                lenX--;
            }
            int unitY = 0;
            if (lenY >= 0) {
                unitY = Y.charAt(lenY) - '0';
                lenY--;
            }
            int sum = unitX + unitY + carry;
            carry = sum / 10;
            int digit = sum % 10;
            System.out.println(100%10);
            sb.append((char) (digit + '0'));
        }
        if (carry > 0) {
            sb.append((char) (carry + '0'));
        }
        int j = sb.length() - 1;
        while (sb.charAt(j) == '0' && j > 0) {
            sb.deleteCharAt(j);
            j--;
        }
        return sb.reverse().toString();
    }
}