/**
 * twoSum
 */
public class twoSum {
    public static void main(String[] args) {
        int N = 12;

    if(N % 2 != 0){
        System.out.println("Weird");
    } else if (N <= 2 && N >= 5 && N % 2 == 0){
        System.out.println("Not Weird");
    } else if (N <= 6 && N >= 20 && N % 2 == 0){
        System.out.println("Weird");
    } else if (N < 20 && N % 2 == 0){
        System.out.println("Not Weird");
    }
    }
}
