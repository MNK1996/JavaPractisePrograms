package java8_Prep.StreamAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TimeStampError {
    public static void main(String[] args) {

        List<String> logs = Arrays.asList(
                "2025-09-17T10:15:30 |INFO|System started",
                "2025-09-17T10:16:00 |ERROR|Null pointer exception",
                "2025-09-17T10:17:00 |ERROR|Database connection failed",
                "2025-09-18T09:00:00 |ERROR|Timeout occurred",
                "2025-09-18T09:05:00 |INFO|User login",
                "2025-09-18T09:10:00 |ERROR|Disk full"
        );

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        logs.stream()
                .map(l -> l.split(" "))
                .filter(p -> "ERROR".equals(p[1]))
                .map(p -> LocalDate.parse(p[0], fmt))
                .collect(Collectors.groupingBy(d -> d, Collectors.counting()))
                .forEach((d, c) -> System.out.println(d + " -> " + c));


        Map<String, Long> errorCount = logs.stream().filter(log ->log.contains("|ERROR|"))
                .map(log ->log.split("T")[0])
                .collect(Collectors.groupingBy(date ->date,Collectors.counting()));
        errorCount.forEach((date, count) -> System.out.println(date+"|"+count));

    }
}