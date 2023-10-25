package leetcode.BinarySearch;

public class SearchinRotatedArray {
    
    static int search(int[] nums, int target) {
        
        int beg = 0;
        int end = nums.length-1;
        
        int mid;
        while(beg<=end)
        {
            mid = (beg+end)/2;
            
            if(nums[mid]==target)
                return mid;
            
            if(nums[beg]<=nums[mid]) // if no. is in beg to mid range
            {
                if(target>=nums[beg] && target <=nums[mid])
                    end = mid - 1;
                else
                    beg = mid + 1;
                
            }
            else
            {
                if(target<=nums[end] && target>=nums[mid])
                    beg = mid + 1;
                else
                    end = mid - 1;
            }
            
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int t = 0;
        int s = search(nums,t);
        System.out.println(s);

    }

    
}
