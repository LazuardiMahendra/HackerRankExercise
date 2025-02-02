import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    int positiveValue = 0;
     int negativeValue = 0;
     int zeroValue = 0;
     
     double positiveResult ;
     double negativeResult;
     double zeroResult; 
     
     for(int i = 0 ; i < arr.size(); i++){
        if(arr.get(i) > 0 ){
            positiveValue++;
         //   System.out.println("Positive : " + arr.get(i));
        }
        
        if(arr.get(i) < 0){
            negativeValue++;
           // System.out.println("Negative : " + arr.get(i));
            
        }
        
        if(arr.get(i) == 0){
            zeroValue++;
           // System.out.println("Zero : " + arr.get(i));
            
        } 
        
     }
           
    //    System.out.println(positiveValue);
    //    System.out.println(negativeValue);
    //    System.out.println(zeroValue);
     
        positiveResult = (double)positiveValue / arr.size();
        negativeResult = (double)negativeValue / arr.size();
        zeroResult =(double)zeroValue /arr.size();
        
        System.out.println(positiveResult);
        System.out.println(negativeResult);
        System.out.println(zeroResult);
      
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
