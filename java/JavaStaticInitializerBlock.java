import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock{

private static final Scanner in = new Scanner(System.in);
private static int B = in.nextInt();
private static int H = in.nextInt();
private static boolean flag = true;

static{
        if(B<=0||H<=0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
           flag = true;
        }
    }      
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

