package leetcode.Array;

import java.util.*;

public class ArraysasList {
    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,5};

        int arr2[] = {1,2,3,4,5};

        System.out.println(arr1+" "+arr2);

        boolean ans = Arrays.equals(arr1, arr2);
        System.out.println(ans);
        
        Arrays.fill(arr1, 33);
        System.out.println(Arrays.toString(arr1));

        // toArray

        List<String> names = new ArrayList<>();
        names.add("anu");
        names.add("chitransh");
        names.add("pops");
        names.add("rohit");
        System.out.println("arraylist format : "+names);
        String []arr = new String[names.size()];

        arr = names.toArray(arr); // names.toArray(arr); // this also works
        System.out.println("arrays.toString: "+Arrays.toString(arr));

        // iterating over array
        for(String s : arr)
        {
            System.out.print(s+" ");
        }

        

    }    
}
