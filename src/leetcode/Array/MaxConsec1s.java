package leetcode.Array;

public class MaxConsec1s {
    
    public static void main(String[] args) {
        
        int nums[] = {1,1,0,1,1,1,1};
        int n = nums.length;
        int c = 0;
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                c++;
            }
            else
            {
                
               
                c = 0;
            }
            
            ans = Math.max(c,ans); // if its inside else, the last index 1 will not be considered as there is no. other than 1 at the end
            
        }
        
        System.out.println(ans);
    }
        
}
