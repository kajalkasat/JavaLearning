package leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthElementOfSortedArrays {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
 
        if(n>m)
            return kthElement(arr2,arr1,m,n,k);
        
        int low = 0;
        
        if(k>m) //if k is GT the size of min. array
        {
            low = k-m;
            
        }
        int high = Math.min(k,n);
        
        while(low<=high)
        {
            int cut1 = (low+high)/2;
            int cut2 = k-cut1;
            
            int l1 = (cut1==0) ? Integer.MIN_VALUE : arr1[cut1-1];
            int l2 = (cut2==0) ? Integer.MIN_VALUE : arr2[cut2-1];
            
            int r1 = (cut1==m) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2==n) ? Integer.MAX_VALUE : arr2[cut2];
            
            if(l1<=r2 && l2<=r1)
            {
                return Math.max(l1,l2);
            }
            else if(l1>r2)
            {
                high = cut1-1;
            }
            else
                low = cut1 +1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {7,12,14,15};
        int arr2[] = {1,2,3,4,9,11};
        int m = 4;
        int n = 6;
        int k = 7;

        System.out.println(kthElement(arr1, arr2, n, m, k));
        

}
}