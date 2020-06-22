import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    // maximumDifference can be accessed from out side of the class.

    // private variables are only accessable within the class.
    private int size, min, max;
	// comstructor
    Difference(int[] oookay){
        size = oookay.length;
        elements = new int[size];
        for (int i = 0; i < size; i++){
            elements[i] = oookay[i];
        }
    }
    // calculates the maximum difference
    public void computeDifference(){
        size = elements.length;
        min = 0;
        max = 0;
        for (int i = 0; i < size; i++){
            // Base case: set min and max to the first element
            if (min == 0 && max == 0){
                min = elements[i];
                max = elements[i];
            }
            // Mimimum case: set min if the element is smaller
            else if(min > elements[i]){
                min = elements[i];
            }
            // Maximum case: set max if the element is larger
            else if(max < elements[i]){
                max = elements[i];
            }
        }
        // setting maximumDifference
        maximumDifference = max - min;
    }

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}