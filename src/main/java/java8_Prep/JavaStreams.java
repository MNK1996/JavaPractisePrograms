package java8_Prep;

import org.apache.el.stream.Stream;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreams {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        try{
//            arr[5] = 10/0;
//        }
//        catch(ArithmeticException ae) {…………}
//        catch(ArrayIndexoutofBoundsException are) {…………}
//        catch(Exception e) {…………}


//        import java.util.*;
//        public class DebugExample1 {
//            public static void main(String[] args) {
//                List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
//                for (String name : names) {
//                    if (name.startsWith("A")) {
//                        names.remove(name);//concurrant modification exception
//                    }
//                }
//                System.out.println(names);
//            }
//        }

//
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.stereotype.Component;
//
//        @Component
//        public class DebugService {
//            @Autowired
//            private HelperService helperService;
//
//            public void doWork() {
//                helperService.help();
//            }
//        }
//
//        @Component
//        class HelperService {
//            public void help () {
//                System.out.println("Helping...");
//            }
//        }
//
//        import org.springframework.web.bind.annotation.*;
//
//        @RestController
//        @RequestMapping("/api")
//        public class DebugController {
//            @GetMapping("/user/{id}")
//            public String getUser(@PathVariable("id") String id) {
//                return "User ID: " + id;
//            }
//        }

        String s = "abcabcbb";
        char[] c = s.toCharArray();

        int occ = 0;
        char[] logocc = new char[c.length];

        for (int i=0; i< c.length-1;i++){
            int j=0;
            while(logocc[j] == c[i]){// 0 a
                j++;
                break;
            }
            if(c[i] != c[i+1]){ // a b c
                logocc[i] = c[i];
                logocc[i+1] = c[i+1];
                occ++;
            }
        }
        System.out.println(logocc);




    }
}