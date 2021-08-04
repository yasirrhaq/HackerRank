
import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0;
        List<Integer> typesId = new ArrayList<Integer>();
        typesId.add(0);
        typesId.add(0);
        typesId.add(0);
        typesId.add(0);
        typesId.add(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                counter1++;
                typesId.set(0, counter1);
            } else if (arr.get(i) == 2) {
                counter2++;
                typesId.set(1, counter2);
            } else if (arr.get(i) == 3) {
                counter3++;
                typesId.set(2, counter3);
            } else if (arr.get(i) == 4) {
                counter4++;
                typesId.set(3, counter4);
            } else if (arr.get(i) == 5) {
                counter5++;
                typesId.set(4, counter5);
            }
        }

        int max = 0;
        int mostFreq = 0;
        for (int j = 0; j < 5; j++) {
            if (max < typesId.get(j)) {
                max = typesId.get(j);
                mostFreq = j + 1;
            }
        }
        return mostFreq;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> birdSighted = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            birdSighted.add(in.nextInt());
        }

        System.out.println(migratoryBirds(birdSighted));
    }
}
