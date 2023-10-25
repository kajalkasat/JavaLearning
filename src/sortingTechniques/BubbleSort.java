package sortingTechniques;

import java.util.Scanner;

public class BubbleSort
{
    // BubbleSort()
    // {
    //     System.out.println("constructor of bubble sort is called");
    // }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
   
        
        // TC : O(n*n)
        for(int i=0;i<n;i++)
        {
            boolean sorted = true;

            for(int j=0;j< (n-1-i) ;j++) 
            /* a.length - 1 - i because, at each iteration the i no og elements at the end are sorted 
             so the no of iterations is reduced  */
            {
                if(a[j] > a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    sorted = false;
                }
            }

            if(sorted) /* created this boolean because, if the array is sorted why iterate more
                         array is sorted if the elements are not swapped even once, so if swap happens, 
                         make the boolean value false */
                {
                    break;
                }
            
        }

        // for(int i=0;i<a.length;i++)
        // {
        //     System.out.print(a[i]+" ");
        // }

        /*  FOR EACH LOOP IN JAVA */

        for(int item : a)
        {
            System.out.print(item+" ");
        }
    }
}