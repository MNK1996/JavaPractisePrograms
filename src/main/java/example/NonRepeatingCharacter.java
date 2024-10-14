package example;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s ="hello";

        for(int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                System.out.println("i = "+ s.charAt(i) +" j ="+s.charAt(j) );
                if (s.charAt(i)!=s.charAt(j)){
                    System.out.println(s.charAt(i));
                    System.exit(0);
                }
            }
        }
    }
}
