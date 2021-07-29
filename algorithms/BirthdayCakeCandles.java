
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

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = candles.get(0);
        int newMax = 0;
        int counter = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (max == candles.get(i)) {
                counter++;
            }

            if (max < candles.get(i)) {
                max = candles.get(i);
                counter = 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
