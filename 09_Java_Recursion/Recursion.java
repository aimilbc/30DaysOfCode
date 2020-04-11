//Video
//https://www.youtube.com/watch?v=glENxqtJzAQ
//
//Note:
//Recursive function is to call themselves in their function.
//Additive identity property is 0 because adding n + 0 will return n.
//Multiplicative identity is 1 because adding n * 1 will return n.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the summation function below.
    static int summation(int n){
        //Base Case: at the end
        if (n <= 0){    // additive identity property
            return 0;
        }
        // Recursion Case: Keep going
        else{
    // ex) summation(3) = 3 + 2 + 1     which is
    //                  = 3 + summation(2)
    //                  = 3 + 2 + summation(1)
    //                  = 3 + 2 + 1 + summation(0)
    //                  = 3 + 2 + 1 + 0 = 6
            return n + summation(n-1);
        }
    }

    // Complete the factorial function below.
    // 3! = 3 * 2 * 1 = 3 * 2!
    static int factorial(int n) {
        // Base Case: at the end
        if(n <= 1){     // multiplicative identity
            return 1;
        }
        // Recursion Case: Keep going
        else{
    // ex) factorial(3) = 3 * 2 * 1     which is
    //                  = 3 * factorial(2)
    //                  = 3 * 2 * factorial(1)
    //                  = 3 * 2 * 1 = 6
            return n * factorial(n-1);
        }
    }

    // Complete the exponentiation function below.
    // 5^3 = 5 * 5 * 5 = 5 * (5^2) = 5 * 5 * (5^1) = 5 * 5 * 5 * (5^0) = 5 * 5 * 5 * 1
    static int exponentiation(int n, int p) {
        // Base Case: at the end
        if(p <= 0){     // multiplicative identity
            return 1;
        }
        // Recursion Case: Keep going
        else{
    // ex) exponentiation(5, 3) = 5 * 5 * 5     which is
    //                  = 5 * exponentiation(5, 2)
    //                  = 5 * 5 * exponentiation(5, 1)
    //                  = 5 * 5 * 5 * exponentiation(5, 0)
    //                  = 5 * 5 * 5 * 1 = 125
            return n * exponentiation(n, p-1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
