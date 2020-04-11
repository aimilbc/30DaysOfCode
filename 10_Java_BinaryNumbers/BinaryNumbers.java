import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> k = new ArrayList<Integer>();
        int count = 0;
        int countOne = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // Convert Decimal to Binary and store binary into arraylist
        // the binary will be stored in reverse order.
        // since it's just counting consecutive number, so reverse order still works.
        while (n != 0){
            k.add(n % 2);
            n = n / 2;
        }
        // Count consecutive 1s in the array list
        for (Integer number : k){
            // count one if k[i] = 1
            if (number == 1){
                count++;
            }
            // update the highest count number into countOne and
            // reset count to zero
            else{
                if ( countOne < count ){
                    countOne = count;
                }
                count = 0;
            }
        }
        // after getting out of the for loop, 
        // countOne will get the last update from count.
        if (count > countOne){
            countOne = count;
        }
        System.out.println(countOne);

        scanner.close();
    }
}
