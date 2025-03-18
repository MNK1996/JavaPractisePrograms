package example;

public class LongestOccurinCharWithIndex {
    public static void main(String[] args) {
        String s = "aabbcccccddiiaa";
        char[] val = s.toCharArray();

        int count=0;
        int len= 0;

        for (int i=0;i<val.length;){
            for (int j=i+1;j< val.length;j++){
                if (val[i] == s.charAt(j)){
                    count++;
                }
                break;
            }
//            i= val.;
        }
    }
}
