
import java.util.*;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        int sameCounter = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) != 0) {
                for (int j = i + 1; j < ar.size(); j++) {
                    if (ar.get(i) == ar.get(j)) {
                        sameCounter++;
                        ar.set(j, 0);
                        break;
                    }
                }
            }
        }
        return sameCounter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            ar.add(in.nextInt());
        }

        sockMerchant(n, ar);
    }

}
