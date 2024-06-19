import java.io.*;
import java.util.*;

public class Solution { 
    
    // public static void checkResult (int result){
    //     if(result < 0){
    //      throw new Exception();  
    //    } 
    // }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        
        int A = B * H;
                
       try{
           if(B > 0 && H >0){
               System.out.println(A);
           } else{
               throw new Exception();
           }
       } catch (Exception e){
           System.out.println(e + ": Breadth and height must be positive");
       }
       

    }
}
