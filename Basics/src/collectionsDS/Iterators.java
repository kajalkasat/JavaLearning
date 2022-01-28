package collectionsDS;

import java.util.*;



public class Iterators
{
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(3);
        al.add(6);
        al.add(9);
        al.add(10);

        Iterator it = al.iterator();
        
        /*
            enumeration can be used to get element by element, cannot remove element
            
            iterator can be used to get element by element and also remove element, hence an improvement 
            of enumeration

            limitations of iterator :
            -> only forward direction, hence enumeration & iterator are single direction cursors
            -> replacement is not possible 
            -> addition of new objects also not there

            to overcome there in iterator : list iterator
            
        */

        while(it.hasNext())
        {
            Integer i = (Integer) it.next();
            if(i%2==0)
                System.out.println(i);
            else
                it.remove();
        }

        System.out.println(al);
    }
}