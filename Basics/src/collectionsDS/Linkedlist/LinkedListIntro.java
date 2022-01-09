package collectionsDS.Linkedlist;

import java.util.*;

public class LinkedListIntro {
    public static void main(String[] args) {
        
        List<Integer> ll = new LinkedList<>();
 
        ll.add(0);
        ll.add(1);
        ll.add(2);
      
     
        System.out.println(ll);
        /*
            insertion at end : linked list and array list give same time
            insertion at start : linked list only creates the new head, remaining positions are not moved
                                array list touches 0 and remaining positions are also moved
                                so array list takes more time than linked list
            same during deletion
        */
    }   
}
