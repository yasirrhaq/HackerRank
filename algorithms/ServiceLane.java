
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

class Result {

    public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < cases.size(); i++) {
            int min = Collections.min(width.subList(cases.get(i).get(0), (cases.get(i).get(1)) + 1));
            result.add(min);
        }
        return result;
    }
}

public class ServiceLane {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> width = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<List<Integer>> cases = new ArrayList<>();

        IntStream.range(0, t).forEach(i -> {
            try {
                cases.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.serviceLane(width, cases);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
