import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;  

public class Queues_Stacks {
    LinkedList queue;

    Queues_Stacks(){
        queue = new LinkedList();
    }
    //method for queue FIFO
    void enqueueCharacter (char c){
        queue.addLast(c);
    }
    char dequeueCharacter(){
        return (char)queue.remove(0);
    }

    //method for stack LIFO
    void pushCharacter(char c){
        queue.addLast(c);
    }
    char popCharacter(){
        return (char)queue.remove(queue.size()-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Queues_Stacks p = new Queues_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}