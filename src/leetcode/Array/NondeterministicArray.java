package leetcode.Array;

import java.util.*;

public class NondeterministicArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;

        ArrayList<Integer> al = new ArrayList<>();
        for(int e : arr)
        {
            al.add(e);
        }
        
        
         Random r = new Random();
        // while(al.size() < 5)
        // {
        //     int no = r.nextInt(n);
        //     if(!al.contains(no))
        //         al.add(no);
        // }

        Collections.shuffle(al);
        System.out.println(al.toString());
        
        for(int i=n-1;i>=0;i--)
        {
            swap(arr,i,r.nextInt(i+1));
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int a, int b)
    {
        int t =arr[a];
        arr[a] = arr[b];
        arr[b] =t;
    }
}
