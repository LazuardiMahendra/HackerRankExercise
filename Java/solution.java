import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class solution {
        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String intToBinnary = Integer.toBinaryString(n);
        String [] splitted = intToBinnary.split("0");

        // String [] splited = intToBinnary.toString().split("0");
        // Integer lenghtInt = splited.length;



        // ArrayList<String> arrayResult = new ArrayList<>();
        // arrayResult.add(intToBinnary);
        // String [] result = arrayResult[0].split("0");

    
    
        
        System.out.println("result : " + Arrays.toString(splitted));
        System.out.println("result : " + splitted.length);

        
        bufferedReader.close();
    }
}
