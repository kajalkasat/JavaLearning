package arraysDataStructure;

import java.util.*;

public class FirstArray {
    public static void main(String[] args) { 
        
        /* int[] marks = new int[5]; // array declaration in java
            int marks[] = new int[5]; 
            both the methods are right

            but why 2 ways ?
            int[] arr1, arr2;                  arr1 and arr2 are both arrays 
            int arr1[], arr2;                  arr1 is only array, arr2 is class

            by default value is 0

            
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("apna no batao");
        int n = sc.nextInt();

        int marks[] = new int[n]; 
        
 
        for(int i=0;i<n;i++)
        {
            marks[i] = sc.nextInt(); // as we take input thro' nextInt we put in marks array at i position
        }

        int s = 0;
        for(int i=0 ; i< (marks.length) ; i++)
        {

            s = s + marks[i];
        }
        int avg = 0;
        avg = s/n;
        System.out.print(avg);


        int arr[] = {13,2,1,4,7,5,2,9};
        // to sort arrays 
        Arrays.sort(arr);

        System.out.println("phela"+arr[5]); // access by position
        for(int e : arr)
        {
            System.out.println("e:"+e+" "); // print each item
        }

        System.out.println(Arrays.toString(arr)); // print the entrie array like [1,2,3,4]
    }
}
