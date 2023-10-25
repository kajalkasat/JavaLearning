package leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class ltNode
{
    int data;
    ltNode left, right;
    ltNode(int item)    {
        data = item;
        left = right = null;
    }
} 

public class LevelOrderTraversal {
 
    static int[] levelsinarray(ltNode root)
    {   
        int arr[] = new int[7];

        Queue<ltNode> q = new LinkedList<ltNode>();
        q.add(root);
        int i =0;
        while(!q.isEmpty())
        {
            ltNode curr = q.poll();
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

    static ArrayList<Integer> levelsLineByLine(ltNode root) // TC : O(n)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<ltNode> q = new LinkedList<ltNode>();
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
                ltNode curr = q.poll();
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

        ltNode root=new ltNode(10);
    	root.left=new ltNode(20);
    	root.right=new ltNode(30);
    	root.left.left=new ltNode(40);
    	root.left.right=new ltNode(50);
    	root.right.right=new ltNode(70);
    	root.right.right.right=new ltNode(80);

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
