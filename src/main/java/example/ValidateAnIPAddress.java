package example;

public class ValidateAnIPAddress {

    public static void main(String[] args) {
        String str = "211.9.111.111.111";
        System.out.println(validateAnIPAddress(str));
    }

    private static boolean validateAnIPAddress(String str) {
        boolean b = false;
        String[] s = str.split("\\.");
        for (String st : s) {
            System.out.println(Integer.valueOf(st.toString()));
            if (Integer.valueOf(st.toString()) < 225 && Integer.valueOf(st.toString()) > 0) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }
}