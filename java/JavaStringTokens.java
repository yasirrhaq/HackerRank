import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.nextLine().trim();
        
        if(s.length()>0){
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            
            for(int i=0; i<tokens.length;i++){
                System.out.println(tokens[i]);
            }
        }else{
            System.out.println(0);
        }
        scan.close();
    }
}

    