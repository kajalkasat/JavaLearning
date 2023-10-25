package collectionsDS.Map;

import java.util.*;

public class ImplementMap {
    public static void main(String[] args) {
        Map<Integer,Character> mp = new HashMap<Integer,Character>();
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

        // sort a map based on values

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
 
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);

        for(Map.Entry<String,Integer> mset: hm1.entrySet())
        {
            System.out.println(mset.getKey()+" "+mset.getValue());
        }
    }

    private static Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        
        Map<String,Integer> ans = new LinkedHashMap<String,Integer>();
        
        List<Map.Entry<String,Integer>> l = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());

        Collections.sort( l, (o1, o2) -> {

            if(o1.getValue() > o2.getValue())
                return 1;
            else
                return -1;
        }
        );

        for(Map.Entry<String,Integer> mset: l)
        {
            ans.put(mset.getKey(),mset.getValue());
        }
        
        return ans;
    }
 
}
