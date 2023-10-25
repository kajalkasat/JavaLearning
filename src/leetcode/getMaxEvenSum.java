package leetcode;


public class getMaxEvenSum {
    public static void main(String[] args) {
        /*
            a[] = 2,3,6,-5,10,1,1
            2+3+6+10+1=22 (even)
            2+3+6+10+1+1=23 (odd)


            

            logic: subtract a positive odd element & add a negative odd element
         */    
        int a[] = {2,3,6,-5,10,1,1};
        int maxEven = maxEvenSum(a);
        System.out.println(maxEven);

    }

    private static int maxEvenSum(int[] a) {
        
        
        int total=0;
        int n=a.length;


        for(int i=0;i<a.length;i++) {
            if(a[i] > 0)
                total += a[i];
        }   
        System.out.println("total is "  + total);
        
        if(total%2==0){
            return total;
        }

        
        // 2,3,6,-5,10,1,1
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if((a[i]%2!=0))
            {
                if(a[i] > 0)
                {
                    ans = Math.max(ans, total-a[i]);
                }
                else{
                    ans = Math.max(ans, total+a[i]);
                }
                    
            }
            
        }
        
        
        
        System.out.println("reached end");
        return ans;

    }
    
}
