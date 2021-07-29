
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

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int total = arr.size();
        double pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < total; i++) {
            if (arr.get(i) == 0) {
                zero++;
            } else if (arr.get(i) > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println(pos / total);
        System.out.println(neg / total);
        System.out.println(zero / total);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }

}
