import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int eksponen = 1;
            int hasil = 1;
            
            for(int j = 1; j <= n; j++){
                if(j == 1){
                    hasil = 1 * b;
                    System.out.print(hasil + a + " ");
                }else{
                    eksponen *= 2;
                    hasil += eksponen * b;
                    System.out.print(hasil + a + " ");  
                }
            } 
            
            System.out.println();       
        }
        
    
        in.close();
    }
}
