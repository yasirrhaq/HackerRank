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

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        String n = in.nextLine();
        BigInteger number = new BigInteger(n);
        
        in.close();
        String result = number.isProbablePrime(1) ? "prime" : "not prime";
        
        System.out.println(result);
        
    }
}
