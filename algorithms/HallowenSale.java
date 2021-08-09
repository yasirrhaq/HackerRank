import java.util.*;

class Result {

    public static int howManyGames(int p, int d, int m, int s) {
        
    int counter =0;
    
    while(s>=p){
        s-= p;
        p = Math.max(p-d,m);
        counter++;
    }
    return counter;
    }
}

public class Solution {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       int p = in.nextInt();
       int d = in.nextInt();
       int m = in.nextInt();
       int s = in.nextInt();
       
       int result = Result.howManyGames(p,d,m,s);
       System.out.println(result);
    }
}
