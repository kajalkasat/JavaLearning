package leetcode.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixMedianRowWiseSorted {
    public static int findMedian(ArrayList<ArrayList<Integer>> A) {
        
        // select range from min possible value to max possible value
        int m = A.size();
        int n = A.get(0).size();
        int total = (m*n);

        // as the greatest element could be in the second row, this giving wrong range
        // int startvalue = A.get(0).get(0);
        // int endvalue = A.get(m-1).get(n-1);

        int startvalue = 0;
        int endvalue = 1000000000;

        while(startvalue <= endvalue)
        {
            int midv = (startvalue+endvalue)/2;
            int ans = 0;
            for(int i = 0;i<m;i++) // travese every row to find the no of elements <=
            {
                int l = 0, e = n-1; /* binary search to find no of element less than the 
                                    given midv, store it in ans*/
                while(l<=e)
                {
                    int midv1 = l + (e-l)/2;
                    if(A.get(i).get(midv1)<=midv) // i-> row; midv1 -> position in col
                        l = midv1 + 1;
                    else 
                        e = midv1 - 1;
                }

                ans += l;
            }

            if(ans <= (long)(total/2))
                startvalue = midv + 1;
            else
                endvalue = midv - 1;
        }

        return startvalue;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>> (3);
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(3);
        a1.add(5);
        al.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(2);
        a2.add(6);
        a2.add(9);
        al.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(3);
        a3.add(6);
        a3.add(9);
        al.add(a3);

        System.out.println("median of matrix is: "+findMedian(al));




    }
}