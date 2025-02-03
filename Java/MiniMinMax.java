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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        
        Long sum;
        ArrayList<Long>  result = new ArrayList<>();
        Long max;
        Long min;
        
        for(int i = 0; i < arr.size(); i++){
            Long temp= 0L;
            for(int j = 0; j < arr.size() ; j++){
             temp += arr.get(j);
            }
            Long tempResult = temp - arr.get(i);
            result.add(tempResult);
        }
        
        max = Collections.max(result);
        min = Collections.min(result);
        
        System.out.println(min + " " +max);
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
