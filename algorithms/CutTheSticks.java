
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

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> sticks = new ArrayList<Integer>();
        int shortest = 0;

        while (arr.size() != 0) {
            shortest = Collections.min(arr);
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - shortest);
            }
            sticks.add(arr.size());
            arr.removeAll(Collections.singleton(0));
        }
        return sticks;
    }

}

public class CutTheSticks {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.cutTheSticks(arr);

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
