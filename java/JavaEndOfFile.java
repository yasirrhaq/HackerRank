import java.io.*;
import java.util.*;


public class JavaEndOfFile{

 public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(in.hasNext()){
            String s = in.nextLine();
            System.out.println(i+1+" "+s);
            i++;
        }
    }
}