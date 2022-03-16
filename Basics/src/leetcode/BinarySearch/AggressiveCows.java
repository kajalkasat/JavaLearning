package leetcode.BinarySearch;
// TC : O(log n) * n
// as the binary search takes O(logn) and O(n) for traversing the array while placing
public class AggressiveCows {
    public static boolean placed(int arr[], int cows, int mid)
    {
        int pc=1;
        int first = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            
            if(Math.abs(first-arr[i])>=mid)
            {
                pc++;
                first=arr[i];
            }
            else
            {
                continue;
            }
        }

        if(pc >= cows)
            return true;
        else
            return false;
    }
    public static int LargestMinDistance(int arr[], int cows, int n)
    {
        int ans = Integer.MIN_VALUE;
        int low = arr[0];
        int high = arr[n-1]-low;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(placed(arr,cows,mid))
            {
                low = mid + 1;
                ans = Math.max(ans,mid);
            }
            else
                high = mid - 1;
        }

        return ans;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,8,9};
        int cows = 3;
        int n = 5;
        System.out.println(LargestMinDistance(arr, cows, n));

    }    
}
