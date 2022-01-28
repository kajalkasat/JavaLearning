package collectionsDS.Heap;

import java.util.*;

public class PriorityQue {

    /*
        priority queue implements heap data sttructure, by default its min heap
        
    */

    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // by default its min heap
        pq.add(15);
        pq.add(20);
        pq.add(10);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());


        // PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Collections.reverseOrder()); // this is for max. heap
        
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>((a,b) -> (b-a)); 

        pq1.add(2);
        pq1.add(7);
        pq1.add(1);
        pq1.add(0);

        System.out.println(pq1.size()+" "+pq1.peek());
    }
}
