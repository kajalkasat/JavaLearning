package collectionsDS.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyWrite {
    /*
        CopyOnWriteArrayList :
        -> thread safe version of array list present in java.util.concurrent
        -> expensive as internally a cloned copy of the array list is created on every write, and JVM
        will synchronize the clone and actual copy.
        -> better to used during READ operations
        -> snap shot style iterator, as when we create an interator on this list and perform add later on the iterator,
         it will not be reflected
        -> remove, set, add 
        -> iterator is fail safe and gurantted to not throw ConcurrentModificationException.
        -> iterator uses a reference to the state of the array at the point the iterator was created
        -> in case of arraylist, when the size limit is crossed the new size of array list ~ doubled increase
        but in CopyOnWriteArrayList everytime an element is added its +1 size

        Internally:
        all operations are inside synchronized block
        -> add:
        syncronized(lock) block it first locks the list, perfoms "COpyOf with size as + 1" and then unlocks
    */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new CopyOnWriteArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
            Integer n = itr.next();
            System.out.println(n);

            if(n == 4)
            {
                // list.remove(n); // throws exception during operation on ArrayList
                list1.remove(n); // on CopyOnWriteArrayList, doesnt throw error
                // itr.remove(); // on CopyOnWriteArrayList, throws exception but valid with ArrayList/vector
            }


        }
        System.out.println(list1.toString()); // this prints that CopyOnWriteArrayList copy where we performed remove

    }

}
