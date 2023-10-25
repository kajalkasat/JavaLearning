package leetcode.Recursion;

import java.util.*;

public class Permutations
{
    public static void recurper(int[] nums, List<List<Integer>> ans, int ind)
    {
        if(ind == nums.length)
        {
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++) // to add an array to arraylist
            {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=ind;i<nums.length;i++)
        {
            swap(nums,i,ind);
            recurper(nums,ans,ind+1); // here its ind+1
            swap(nums,i,ind); 
        }
    }
    
    public static void swap(int[] nums, int s,int e)
    {
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    }
    
    public static List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        recurper(nums,ans,0);
        return ans;
    }
    public static void main(String[] args) {
        
        int nums[] = {1,2,3};
       
        
        List<List<Integer>> ans =  permute(nums);
        System.out.println(ans); 
    }
}