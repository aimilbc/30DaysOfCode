import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class findPrime {

    static boolean check(int num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for (int i = 0; i < count ; i++){
            int num = in.nextInt();
            if(num > 1 && check(num)){
                System.out.println("Prime");
            }else
                System.out.println("Not prime");
        } 
    }
}