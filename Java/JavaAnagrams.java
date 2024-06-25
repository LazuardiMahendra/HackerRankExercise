import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = true;
        
        String aString = sortArray(a);
        String bString = sortArray(b);
        
        if(aString.equalsIgnoreCase(bString)){
            result = true;
        }else{
            result = false;
        }
        
        
        
        return result;
    }
    
    static String sortArray(String s ){
        char[] charArray = s.toLowerCase().toCharArray();
        int n = charArray.length;
        
        for(int i = 0; i < n ; i++){
            for(int j = 0;  j < n -i -1; j++){
                if(charArray[j] > charArray[j +1]){
                    char temp = charArray[j + 1];
                    charArray[j + 1] = charArray[j];
                    charArray [j] = temp;
                }
            }
        }
        return new String(charArray);
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
