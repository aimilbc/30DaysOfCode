//https://www.youtube.com/watch?v=cqoGE1GPqU8

import java.util.*;
import java.io.*;
class NodePractice{
	NodePractice left,right;
    int data;
    NodePractice(int data){
        this.data=data;
        left=right=null;
    }
}
class BinarySearchTrees{

	public static int getHeight(NodePractice root){
        if(root == null)
            return -1;
        else
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

	public static NodePractice insert(NodePractice root,int data){
        if(root==null){
            return new NodePractice(data);
        }
        else{
        	NodePractice cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            NodePractice root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }	
}