import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {

    public static  Node insert(Node head,int data) {
        Node n = new Node(data);
        // Base case: add a new node on the linked list
        if (head == null){
            head = n;
        }
        // Add case: find the last node and add new node.
        else{
            // make a temporary node because once the head travel, it won't go back.
            // the key is to keep the head as is, but use it as reference of the start point
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}