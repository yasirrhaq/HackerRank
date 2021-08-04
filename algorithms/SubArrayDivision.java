
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

public class SubArrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int total = 0;
            for (int j = i; j < i + m; j++) {
                total += s.get(j);
            }
            if (total == d) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> s = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            s.add(in.nextInt());
        }
        int d = in.nextInt();
        int m = in.nextInt();

        System.out.println(birthday(s, d, m));

    }
}
