
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

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoint = 0, bobPoint = 0;
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alicePoint++;
            } else if (a.get(i) < b.get(i)) {
                bobPoint++;
            }
        }
        result.add(alicePoint);
        result.add(bobPoint);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

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
