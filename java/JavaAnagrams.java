import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        char[] charactersA = a.toLowerCase().toCharArray();
        char[] charactersB = b.toLowerCase().toCharArray();
        
        java.util.Arrays.sort(charactersA);
        java.util.Arrays.sort(charactersB);

        return java.util.Arrays.equals(charactersA, charactersB) ? true : false;       
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
