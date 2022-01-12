package leetcode.Array;

public class Postmorteum {
    
    public static void main(String[] args) {
        int arr[]; // declaration : this is creating memory in stack
        arr = new int[5]; // initialisation : creating memory in heap --> DYNAMIC MEMORY ALLOCATION

        /*
        the memory on left is during compiletime, and the right side is the actual object creation during runtime
        memory allocated at runtime is called dynamic memory allocation

        In Java, array may or maynot be continously stored ? 
        -> objects are created in the heap
        -> heap storage is NOT continuous
        -> hence, array objects in heap may/may not continuous--> depends on JVM
        */

        







        // block scope
        int a = 10;
        {
            // int a = 20; --> as 'a' is already defined as int, we can only change its value
            a = 20;
            int c = 15;
            System.out.println("a:"+a);

            /* value initialised in this block, can be accessed only here, like 'c' 
            values can be re-assigned like 'a' */
        }
        // System.out.println("c:"+c); --> not possible as 'c' is accessible only inside the "block scope"

    }
}
