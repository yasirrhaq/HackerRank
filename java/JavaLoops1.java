import java.util.*;

public class JavaLoops1{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        for(int i = 0; i<10; i++){
            total = n*(i+1);
            System.out.println(n+" x "+(i+1)+" = "+total);
        }
    }
}