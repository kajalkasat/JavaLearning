package leetcode.PQ;

import java.util.*;

public class MinRemovalstoMakeFreqEqual {

    static int minCntCharDeletionsfrequency(char[] str, int N) {

        HashMap<Character, Integer> mp = new HashMap<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

        int removals = 0;

        for (int i = 0; i < N; i++) {
            mp.put(str[i], mp.getOrDefault(str[i], 1) + 1);
        }

        
        for (Map.Entry<Character, Integer> it : mp.entrySet()) {
            pq.add(it.getValue());
        }

        
        while (!pq.isEmpty()) {

            int curr = pq.peek();
            pq.remove();

            if (pq.isEmpty()) {

                return removals;
            }

            if (curr == pq.peek()) {

                if (curr > 1) {

                    pq.add(curr - 1);
                }

                removals++;
            }
        }

        return removals;
    }

   
    public static void main(String[] args){
    String str = "abbbcccd";

    
    int N = str.length();
    System.out.print(+minCntCharDeletionsfrequency(str.toCharArray(), N) + "removals to be made to make frequency of each character unique");

    }
}
