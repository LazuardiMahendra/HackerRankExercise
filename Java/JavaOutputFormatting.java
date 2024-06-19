import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String space = "";
                String zero = "0";
                String numString=  Integer.toString(x);
                System.out.print(s1);
                if(s1.length() <= 15){
                    for(int j = 0; j < 15 - s1.length(); j++){
                        space = " ";
                        System.out.print(space);
                    }
                }
                if(numString.length() != 3){
                    for(int k = 0; k < 3 - numString.length(); k++){
                        System.out.print("0");
                    }
                }
                System.out.print(numString);
                 
                System.out.println();    
            }
            System.out.println("================================");

    }
}



