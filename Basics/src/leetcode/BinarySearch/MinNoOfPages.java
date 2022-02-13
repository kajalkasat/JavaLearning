package leetcode.BinarySearch;

public class MinNoOfPages
{
    public static boolean ispossible(int A[], int mid, int N, int M)
    {
        int countofstudents = 1;
        int s1 = 0;
        for(int i=0;i<N;i++)
        {
            //System.out.println(s1);
            if(A[i] > mid)
            {
                // System.out.println(mid);
                // break;
                return false; // when a[i] > mid, we have to return false, as we want to get the min possible answer
                            
            }
            if(s1+A[i]>mid)
                {
                    
                    countofstudents++;
                    s1 = A[i];
                    if(s1 > mid)    
                    {
                        break;
                    }
                    
                }
            else
            {
                s1+=A[i];
            }
            
        }
     
        if(countofstudents > M)
            return false;
        else
            return true;
    }
    
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int ans = Integer.MAX_VALUE;
        
        int low = A[0];
        int s = 0;
        for(int e : A)
        {
            s += e;
        }
    
        int high = s;
        while(low<=high)
        {
            int mid = (low+high) / 2;
            if(ispossible(A,mid,N,M))
            {
                
                ans = Math.min(ans,mid);
                System.out.println("ans:"+ans);
                high = mid - 1;
            }
            else
                low = mid + 1;
                
            
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
        int A[] = {13, 31, 37, 45, 46, 54, 55, 63, 73, 84, 85};
        int M = 9, N = 11;
        int ans = findPages(A,N,M); 
        System.out.println(ans);

    }
}