package example;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, return immediately
            }
            digits[i] = 0; // Set to 0 and continue for carry
        }

        // If all digits were 9, we need an extra digit
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);
        System.out.println(java.util.Arrays.toString(result)); // Output: [1, 2, 4]
    }
}