import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int actDay, expDay, actMonth, expMonth, actYear, expYear, calAct, calExp, fine;

        actDay = in.nextInt();
        actMonth = in.nextInt();
        actYear = in.nextInt();

        expDay = in.nextInt();
        expMonth = in.nextInt();
        expYear = in.nextInt();

        if(actYear > expYear){
            System.out.println("10000");
        }else if(actYear == expYear && actMonth > expMonth){
            System.out.println((actMonth - expMonth) * 500);
        }else if(actYear == expYear && actMonth == expMonth && actDay > expDay){
            System.out.println((actDay - expDay) * 15);
        } else
            System.out.println("0");

    }
}