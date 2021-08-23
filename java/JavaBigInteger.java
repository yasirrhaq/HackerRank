import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        
        BigInteger sum = a.add(b);
        BigInteger multiply = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(multiply);
        
        in.close();
    }
}