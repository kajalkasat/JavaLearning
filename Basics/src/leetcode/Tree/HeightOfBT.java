package leetcode.Tree;


public class HeightOfBT {

    static int height(Node root)
    {
        if(root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return 1+Math.max(rh, lh);
    }

    static int countNodes(Node root) {
        
        if(root == null)
            return 0;
        
        
       // return countNodes(root.left) + countNodes(root.right) + 1; // TC : O(n)
        
        
        Node curr = root;
        int lh = 0, rh = 0;
        while(curr != null) // give curr!=null becaause in ex1 "6" has to return 1, 
            // 6 != null, so lh and rh will be incremented once, lh = rh = 1, hence [pow(2,1) - 1] = 2-1 = 1
        {
            lh++;
            curr = curr.left;
        }
        
        curr = root; 
        while(curr !=null)
        {
            rh++;
            curr = curr.right;
        }
        
        if(lh == rh)
            return (int) Math.pow(2,lh)-1; // add this to reduce the search space, so TC: for 1 side = O(logn) , hence total TC : O(log n)*O(log n)
        else
            return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.right=new Node(70);
    	root.right.right.right=new Node(80);

        System.out.println(height(root));

        System.out.println(countNodes(root));
    }
}
