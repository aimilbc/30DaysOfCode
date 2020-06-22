import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculators implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                sum += n/i;
                 }
        }
        return sum;
    }
}

class Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculators(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}