package leetcode.StackandQueue;

import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int n = 8, k=3;
        int nums[] = {1,3,-1,-3,5,3,6,7};
        Stack<Integer> s = new Stack<>();
        
        
        int ans[] = new int[(n-k)+1];
        for(int i=0;i<n-k+1;i++)
        {
            int max_element = Integer.MIN_VALUE;
            if(s.isEmpty() )
            {
                while(s.size()<k) 
                {
                    s.push(nums[i]);
                    i++;

                }
            }
            
            
            while(!s.isEmpty())
            {
                
               max_element = Math.max(max_element,s.peek());
                s.pop();
            }
            
            ans[i] = max_element;
        }
        

    }
}
