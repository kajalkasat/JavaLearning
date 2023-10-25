package leetcode.Tree;

import java.util.ArrayList;

class Node
{
    int data;
    ltNode left, right;
    Node(int item)    {
        this.data = item;
        this.left = this.right = null;
    }
} 
public class PrintKNodesFromRoot {
    
    
    static void recurans(ltNode root, int k, ArrayList<Integer> ans)
    {
            
            if(root == null)
                return;
            if(k==0 && root!=null)
            {
                ans.add(root.data);
                
                
            }
            else
            {
                //if(root.left != null)
                    recurans(root.left,k-1,ans);
                //else if(root.right != null)
                    recurans(root.right,k-1,ans);
            }   
    }
    static ArrayList<Integer> Kdistance(ltNode root, int k)
    {
          // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(k==0)
            {
                ans.add(root.data);
                return ans;

                // return ans.add(root.data); // as arraylist .add() return boolean not arraylist
            }
        
        recurans(root,k,ans);      
        return ans;
    }
    public static void main(String[] args) {
        ltNode root=new ltNode(10);
    	root.left=new ltNode(20);
    	root.right=new ltNode(30);
    	root.left.left=new ltNode(40);
    	root.left.right=new ltNode(50);
    	root.right.right=new ltNode(70);
    	root.right.right.right=new ltNode(80);

        ArrayList<Integer> ans = Kdistance(root, 2);
        // for(int e : ans)
        // {
        //     System.out.println(ans);
        // }
        System.out.println(ans);
        
    }
}
