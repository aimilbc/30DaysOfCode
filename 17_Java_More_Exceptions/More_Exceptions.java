import java.io.*;
import java.util.Scanner;

class Calculator{
    //default constructor
    Calculator(){}
    public int power(int N, int P)throws Exception{
        // error base: throw exception
        if(N<0 || P<0){
            throw new Exception("n and p should be non-negative");
        }else{
            // execute the problem.
            return (int) Math.pow(N, P);
        }
    }
}

class MoreException{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}