import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Locale;
import java.text.NumberFormat;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale localeIndia = new Locale("en","IN");
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(localeIndia);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String usFormat = us.format(payment);
        String indiaFormat = india.format(payment);
        String chinaFormat = china.format(payment);
        String franceFormat = france.format(payment);
        
        System.out.println("US: " + usFormat);
        System.out.println("India: " + indiaFormat);
        System.out.println("China: " + chinaFormat);
        System.out.println("France: " + franceFormat);
    }
}