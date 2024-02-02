import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        List<Integer> integers = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            int v = s.nextInt();
            integers.add(v);
        }
        
        int q = s.nextInt();

        for(int i = 0; i<q; i++){
            String q2 = s.next();
            
            if(q2.contains("Insert")){
                int index = s.nextInt();
                int value = s.nextInt();
                integers.add(index, value);
            }else if(q2.contains("Delete")){
                int deleteIndex = s.nextInt();
                integers.remove(deleteIndex);
            }
        }
        
        for(int i = 0; i<integers.size(); i++){
            System.out.print(integers.get(i)+ " ");
        }
                
    }
}