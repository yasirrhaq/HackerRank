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

    public static long taumBday(long b, long w, long bc, long wc, long z) {
        
    long result =0;
    if(bc>wc+z){
        bc = wc+z;
    }else if(wc>bc+z){
        wc = bc+z;
    }
    result = b * bc + w * wc;
    return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                long b = Long.parseLong(firstMultipleInput[0]);

                long w = Long.parseLong(firstMultipleInput[1]);

                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                long bc = Long.parseLong(secondMultipleInput[0]);

                long wc = Long.parseLong(secondMultipleInput[1]);

                long z = Long.parseLong(secondMultipleInput[2]);

                long result = Result.taumBday(b, w, bc, wc, z);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
