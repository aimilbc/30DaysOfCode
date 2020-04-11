//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Map<String, String> addressBook = new HashMap<String, String>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            String stPhone = Integer.toString(phone);
            // Write code here
            addressBook.put(name, stPhone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(addressBook.containsKey(s)){
                System.out.println(s + "=" + addressBook.get(s)); 
            }else
                System.out.println("Not found");
            
        }
        in.close();
    }
}
