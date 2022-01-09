package leetcode.Array;
public class XorQueries {
    
    static int[] xorQueries(int[] arr, int[][] queries) {
        
        int ans[] = new int[queries.length];
        int prefix[] = new int[arr.length];
        int k=0;
    /*
        this is basic approach
         for(int[] i : queries)
        {
            int s = i[0];
            int e = i[1];
            int xorv = 0;
            for(int j=s;j<=e;j++)
            {
               xorv ^= arr[j];
            }
            ans[k] = xorv;
            k++;
        }
        return ans;
    */
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefix[i] = prefix[i-1] ^ arr[i];      // prefix xor of the array
        }
        
        for(int []i : queries)
        {
            if(i[0]==0)
                ans[k] = prefix[i[1]];
            else
                ans[k] = prefix[i[1]]^prefix[i[0]-1];
            k++;

        }

        return ans;
    }
 
    public static void main(String[] args) {
        int queries[][] = {{0,1},{1,2},{0,3},{3,3}};
        int arr[] = {1,3,4,8};
        int f[] = xorQueries(arr,queries);
        for(int e : f)
        {
            System.out.println(e);
        }
        
    }
}
