package collectionsDS.Heap;

import java.util.PriorityQueue;

public class MaxItemsWithGivenSum {

    public static void main(String[] args) {
        
        int arr[] = {1,2,5,111,220};
        int sum = 10;

        // this array already represents a min. heap, so keep popping the top element upto <= sum
        // TC : O(n) + O(res * log(n))
        int n = arr.length;
 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i : arr)
        {
            pq.add(i);
        }

        int res = 0,curr_s = 0;
        while(curr_s<=sum)
        {
            if((curr_s + pq.peek()) > sum)
                break;

            
            curr_s += pq.poll();
            res++;
             
        }

        System.out.println(res);
    }
}