package Java17;

public class SwitchExpression {
    public static void main(String[] args) {
        String daySat= "Mon";


        String time = "";
        time=switch(daySat){
            case "Sat" -> "8am";
            default ->  "9am";
        };

//        time=switch(daySat){
//            case "Sat" :yield  "8am";
//            default : yield  "9am";
//
//        };

//        switch(daySat){
//            case "Sat" : time= "8am";
//            default : time= "9am";
//
//        };

        System.out.println(time);
    }

}