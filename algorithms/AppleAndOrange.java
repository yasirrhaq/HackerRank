
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

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int maxSamHouseRange = t;
        int minSamHouseRange = s;

        int appleTreeLocation = a;
        int orangeTreeLocation = b;

        int applesOnHouseCounter = 0;
        int orangesOnHouseCounter = 0;

        int appleDistance = 0;
        int orangeDistance = 0;

        List<Integer> applesDistanceToTree = new ArrayList<Integer>();
        List<Integer> orangesDistanceToTree = new ArrayList<Integer>();
        List<Integer> applesLocation = new ArrayList<Integer>();
        List<Integer> orangesLocation = new ArrayList<Integer>();

        //count distance from each tree based on fruit    
        for (int i = 0; i < apples.size(); i++) {
            applesLocation.add(apples.get(i));
            appleDistance = appleTreeLocation + applesLocation.get(i);
            applesDistanceToTree.add(appleDistance);

            if (applesDistanceToTree.get(i) >= minSamHouseRange && applesDistanceToTree.get(i) <= maxSamHouseRange) {
                applesOnHouseCounter++;
            }
        }

        for (int i = 0; i < oranges.size(); i++) {
            orangesLocation.add(oranges.get(i));
            orangeDistance = orangeTreeLocation + orangesLocation.get(i);
            orangesDistanceToTree.add(orangeDistance);

            if (orangesDistanceToTree.get(i) >= minSamHouseRange && orangesDistanceToTree.get(i) <= maxSamHouseRange) {
                orangesOnHouseCounter++;
            }
        }

        System.out.println(applesOnHouseCounter);
        System.out.println(orangesOnHouseCounter);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
