// https://www.youtube.com/watch?v=Z9uAwnz_wBA

import java.util.*;

class Printer <T> {

        public static <T> void printArray(T[] ary){
            // NOTE: <T>, <E>, <D> or any alphabets in <> means generic type. 
            //      it'll hold any type, but has to be an object, so to hold integer,
            //      we have to use "Integer".
        for (T element: ary){
            System.out.println(element);
        }
    }

}

public class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}