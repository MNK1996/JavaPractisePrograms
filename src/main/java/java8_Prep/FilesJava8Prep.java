package java8_Prep;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class FilesJava8Prep {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("../JavaPractisePrograms/src/main/java/java8_prep/file.txt");
//        Files.lines(inputPath)
//                .map(s->s.split(" "))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

//        Files.list(Paths.get("../JavaPractisePrograms/src/main/java/java8_prep")).forEach(System.out::println);


        Path outputPath = Paths.get("../JavaPractisePrograms/src/main/java/java8_prep/output.txt");

        try (Stream<String> lines = Files.lines(inputPath)) {
            Files.write(outputPath,
                    lines.map(s -> s.split(" "))
                            .flatMap(Arrays::stream)
//                            .distinct()
//                            .sorted()
                            .toList() // Collect into a List for writing
            );
            System.out.print("Words written to " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}