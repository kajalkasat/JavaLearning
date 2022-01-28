package leetcode.PQ;

import java.util.PriorityQueue;

public class MultiplcayionAtDiffIndex {
    
    public static void main(String[] args) {
        
        int nums[] = {3,4,5,2};
        int n = nums.length;
        
        int ans = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> (b-a));
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;i<n;j++)
            {
                pq.add( (nums[i]-1) * (nums[j]-1) );
            }
            ans = Math.max(ans,pq.peek());
            
            while(!pq.isEmpty())
            {
                pq.remove();
            }
        }
        
        System.out.println(ans);
    }
}
