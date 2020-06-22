import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionPractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String S = in.next();
            int result = Integer.parseInt(S);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Bad String");
        }
        
    }
}