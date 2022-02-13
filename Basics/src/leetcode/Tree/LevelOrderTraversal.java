package leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
} 

public class LevelOrderTraversal {
 
    static int[] levelsinarray(Node root)
    {   
        int arr[] = new int[7];

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int i =0;
        while(!q.isEmpty())
        {
            Node curr = q.poll();
            if(curr.left != null)
            {
                q.add(curr.left);
            }
            if(curr.right != null)
            {
                q.add(curr.right);
            }

            arr[i++] = curr.data;
        }

        return arr;
    }

    static ArrayList<Integer> levelsLineByLine(Node root) // TC : O(n)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        int ans = 0;
        

        while(!q.isEmpty())
        {
            int N = q.size();
            
            // if(curr == null)
            // {
            //     arr[i++] = -50;
            //     q.add(null);
            //     continue;
            // }
            
            for(int i =0; i < N; i++)
            {
                Node curr = q.poll();
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
                arr.add(curr.data);
            }
            ans = Math.max(ans,N);
            arr.add(-50);
           
        }



        return arr;
    }

    public static void main(String[] args) {
        /*
            this is breadth first search
            approach 1:
                -> calculate the height of binary tree
                -> k = 0 to height, we call print k nodes, and print all the nodes level wise
                -> TC : O(n * h)
            
            
        */

        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.right=new Node(70);
    	root.right.right.right=new Node(80);

        int a[] = levelsinarray(root);

        for(int i : a)
        {

            System.out.print(i+" ");
        }

        System.out.println("line by line :s");
        ArrayList<Integer> a1 = levelsLineByLine(root);
        for(int e : a1)
        {
            if(e != -50)
            {
                System.out.print(e+" ");
            }
            else
            {
                System.out.println();
            }
        }
    }
}
