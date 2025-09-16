package java8_Prep;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class FilesJava8Prep {
    public static void main(String[] args) throws IOException {
//        Files.lines(Paths.get("file.txt"))
//                .map(s->s.split(" "))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

        Files.list(Paths.get(".")).forEach(System.out::println);

    }
}