package collectionsDS.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortkSortedArray {
    
    public static void main(String[] args) {
        int arr[] = {9,8,7,18,19,17};
        int n = arr.length;
        int k =2;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0 ; i<=k ; i++)
        {
            pq.add(arr[i]);
        }

        int ind = 0;
        for(int i = k+1;i<n;i++) // as we added 1st k+1 elemts to pq, we move to next half ok k elements
        {
            arr[ind++] = pq.poll();
            pq.add(arr[i]); 
            
        }
        
        while(!pq.isEmpty())
        {
            arr[ind++] = pq.poll();
        }

        for(int e : arr)
        {
            System.out.print(e+ " ");
        }

        System.out.println(Arrays.toString(arr)); // to print the array directly
    }
}
