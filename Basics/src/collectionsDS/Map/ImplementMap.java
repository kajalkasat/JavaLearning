package collectionsDS.Map;

import java.util.HashMap;
import java.util.*;

public class ImplementMap {
    public static void main(String[] args) {
        HashMap<Integer,Character> mp = new HashMap<Integer,Character>();
        mp.put(1,'A');
        mp.put(3,'B');
        mp.put(19, 'L');
        mp.put(7, 'G');
        mp.put(2,'C');
        mp.put(12, 'J');
        System.out.println(mp);

        System.out.println("replacement of put(): "+mp.put(2,'D'));

        Set ks = mp.keySet();
        System.out.println(ks);
        
        Collection vs = mp.values();
        System.out.println(vs);

        Set es = mp.entrySet();
        System.out.println(es);

        // print entrysets one by one - use of entry specific methods
        Iterator it = es.iterator();
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            // System.out.println("map.entry direct sysout: "+me);
            
            System.out.println(me.getKey()+" "+me.getValue());
            if(me.getKey().equals(1))
            {
                me.setValue('F');
            }

        }

        System.out.println(mp);

        Map<String,Integer> mp1 = new HashMap<String,Integer>();
        mp1.put("aa",1);
        mp1.put("aa",2);
        mp1.put(null, 6);
        mp1.put("bb",4);
        System.out.println(mp1.get("aa"));
        System.out.println(mp1.put("aa",3));
        System.out.println(mp1.get("aa"));
    }
}
