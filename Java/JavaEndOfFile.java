import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = "";
        int num = 0;

        while(scanner.hasNextLine()){
            n = scanner.nextLine();
            num++;
            System.out.println(num + " " + n);

        }
    }
}
