import java.util.*;

class Result {

    public static int hurdleRace(int k, List<Integer> height) {
    Integer max = Collections.max(height);
    return k<max ? max-k:0;
    }

}

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> height = new ArrayList<Integer>();
        for(int i =0; i<n; i++){
            height.add(in.nextInt());
        }
        int result = Result.hurdleRace(k,height);
        System.out.println(result);
    }
}
