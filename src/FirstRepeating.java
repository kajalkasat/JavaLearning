import java.util.*;

class myComparator implements Comparator<Map.Entry<Integer,Integer>>
{
    public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2)
    {
        if(o1.getValue() > o2.getValue())
            return -1;
        else if(o1.getValue() < o2.getValue())
            return 1;
        else
        {
            if(o1.getKey() > o2.getKey())
                return -1;
            else
                return 1;
        }
    }
}
public class FirstRepeating{
    public static void main(String[] args) {
        
        int arr[] = {10, 7, 8, 1, 8, 7, 6};

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        // for(Map.Entry<Integer,Integer> data : map.entrySet())
        // {
        //     System.out.println(data.getKey()+" "+data.getValue());
        // }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new myComparator());

        for(Map.Entry<Integer,Integer> data : list)
        {
            System.out.println(data.getKey() + " " + data.getValue());
        }
        /*
            n = 5
            1 2 3 4 5
            get(2) : 2
            2 1 3 4 5
            add(6)
            6 2 1 3 4

            1 2 3 5 5 
            add(6)
            6 1 2 3 5

            employee : id, name, manager id
                        1  abc      3
                        2  def      3
                        3  xyz      null
                        4  aaa      5
                        5  bbb      null

            manager :  id, name
                        

            abc xyz
            def xyz
            xyz null 

            SELECT name, name from employee e full join on manager m where e.manid = m.id 
        */

    }
}