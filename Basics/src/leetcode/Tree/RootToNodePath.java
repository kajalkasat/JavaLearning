package leetcode.Tree;

import java.util.*;

public class RootToNodePath
{
    static boolean RtoNPath(Node curr,int n, List<Integer> ans)
    {
        /*
        if(curr.data == n)
        {
            ans.add(curr.data);
            return;
        }   
        if(curr.left == null || curr.right == null)
        {
            ans.remove(ans.size()-1);
        }
        RtoNPath(curr.left, n, ans);
        RtoNPath(curr.right, n, ans);
        */

        if(curr == null)
            return false;
        
        ans.add(curr.data); 
        // we will add whaever the curr.data is, and then based on the condition we want to add we return true
        // when the if condn fails it will go to else and we will remove and return false

        if(curr.data == n)
        {
            return true;
        }

        if( (RtoNPath(curr.left, n, ans) == true)   || (RtoNPath(curr.right, n, ans) == true ) )
        {
            return true; // from this point, it traverses upto the root returning for true, and when finally the root returns true, call goes to main()
        }

        ans.remove(ans.size()-1);
        return false;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.right=new Node(70);
    	root.right.right.right=new Node(80);

        /*
            root to node path : using inorder traversal
            inorder is used because it easy to understand and explain
        */
        List<Integer> ans = new ArrayList<Integer>();
        RtoNPath(root,70,ans);
        System.out.println(ans.toString());
    }
}
