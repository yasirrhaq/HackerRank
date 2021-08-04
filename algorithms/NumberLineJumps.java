
import java.util.Scanner;

public class NumberLineJumps {

    public static String kangaroo(int x1, int x2, int v1, int v2) {
        double j = (double) (x1 - x2) / (v2 - v1);
        if (j == Math.floor(j) && j >= 0) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int v1 = in.nextInt();
        int v2 = in.nextInt();

        kangaroo(x1, x2, v1, v2);
    }

}
