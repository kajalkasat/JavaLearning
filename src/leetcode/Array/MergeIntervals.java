package leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        
        List<int[]> res = new ArrayList<>();

        if(intervals.length == 0 || intervals == null)
            return intervals;

       Arrays.sort(intervals, (a,b) -> a[0] - b[0]); // sort in ascending order
       
       int start = intervals[0][0];
       int end = intervals[0][1]; 
       
       for(int[] i : intervals)
       {
           if(i[0] <= end) // 2<=3; if overlapped
           {
               end = Math.max(end, i[1]);
           }
           else
           {
               res.add(new int[]{start,end});
               start=i[0];
               end=i[1];
           }
       }
       
       res.add(new int[]{start,end});
       return res.toArray(new int[0][]);        
   }

   public static void main(String[] args) {
   
    int[][] a = {{1,3},{2,6},{8,10},{9,12},{15,18}};
    int arr[][] = merge(a);

//      for(int i=0;i<arr.length;i++)
//      {
//          for(int j=0;j<arr[0].length;j++)
//          {
//              System.out.print(arr[i][j]+ " ");
//          }
//          System.out.println();
//      }

//    }

        for(int[] e:arr)
        {
            System.out.println(e[0]+" "+e[1]); 
        }
   }
}