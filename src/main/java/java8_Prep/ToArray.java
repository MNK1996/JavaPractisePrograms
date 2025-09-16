package java8_Prep;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToArray  {
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("file.txt")).forEach(System.out::println);

    }
}