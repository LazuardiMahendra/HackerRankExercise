import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int sum = A.length() + B.length();
        
        
        int lexicographic = A.compareToIgnoreCase(B);
        String result = "";
        if(lexicographic <= 0){
            result = "No";
        } else{
            result = "Yes";
        }
     

        System.out.println(sum);
        System.out.println(result);
        System.out.println(capitalFirstWord(A) + " " + capitalFirstWord(B));      
    }
    
    public static String capitalFirstWord(String str){
        
        char a = Character.toUpperCase(str.charAt(0));
        
        String  subString = str.substring(1);
        
        return a + subString;
        
    }
}



