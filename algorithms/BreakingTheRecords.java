
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int bestCounter = 0, worstCounter = 0;
        int bestRecord = scores.get(0), worstRecord = scores.get(0);
        List<Integer> breakingRecords = new ArrayList<Integer>();

        for (int i = 0; i < scores.size(); i++) {
            if (bestRecord < scores.get(i)) {
                bestRecord = scores.get(i);
                bestCounter++;
            }

            if (worstRecord > scores.get(i)) {
                worstRecord = scores.get(i);
                worstCounter++;
            }

            if (breakingRecords.isEmpty()) {
                breakingRecords.add(bestCounter);
                breakingRecords.add(worstCounter);
            }

            breakingRecords.set(0, bestCounter);
            breakingRecords.set(1, worstCounter);
        }
        return breakingRecords;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
