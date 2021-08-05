
import java.util.*;

public class BillDivision {

    public static void bonAppetit(List<Integer> itemsCost, int k, int b) {
        int notEatenId = 0, splitPrice = 0;
        for (int i = 0; i < itemsCost.size(); i++) {
            notEatenId = itemsCost.get(k);
            if (itemsCost.get(i) == itemsCost.get(k)) {
                continue;
            } else {
                splitPrice += itemsCost.get(i);
            }
        }
        int total = splitPrice / 2;
        int annaMoneyLeft = 0;
        if (b > total) {
            annaMoneyLeft = b - total;
            System.out.println(annaMoneyLeft);
        } else if (b == total) {
            System.out.println("Bon Appetit");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> itemsCost = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            itemsCost.add(in.nextInt());
        }

        int b = in.nextInt();

        bonAppetit(itemsCost, k, b);

    }

}
