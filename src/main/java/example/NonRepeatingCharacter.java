package example;


public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s ="hello";
        String s1=new String("hello");
        if (s1==s){
            // 1. To Compare both strings if is same "s1.equals(s)" hello.equals(hello)
            //  2. To Compare both strings are in different format s1.equalsIgnoreCase(s) hello.equals(Hello)
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        for(int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                System.out.println("i = "+ s.charAt(i) +" j ="+s.charAt(j) );
                if (s.charAt(i)!=s.charAt(j)){
                    System.out.println(s.charAt(i));
                }
            }
        }
    }
}
