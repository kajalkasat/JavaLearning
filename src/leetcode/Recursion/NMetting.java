package leetcode.Recursion;

import java.util.*;
import java.util.Comparator;
class meeting
{
    int start,end,pos;
    meeting(int start, int end , int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
// class meetingComparator implements Comparator<Integer>
// the type in Comparator<Integer> is Integer, hence compare(Integer o1, Integer o2) o1,o2 also Integer
// {

//     @Override
//     public int compare(Integer o1, Integer o2) {
//         // TODO Auto-generated method stub
//         return 0;
//     }
    
// }
class meetingComparator implements Comparator<meeting>
{

    @Override
    public int compare(meeting o1, meeting o2) {
        if(o1.end>o2.end)
            return 1;
        else if(o1.end<o2.end)
            return -1;
        else if(o1.pos<o2.pos)
            return -1;
        return 1;
    }
    
}
class NMetting
{
    public static int countOfMeetings(int start[],int end[], int n)
    {
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i = 0;i < n; i++)
        {
            meet.add(new meeting(start[i],end[i],i+1));
        }
        
        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);

        int c = 1;
        int f = meet.get(0).end;
        for(int i=1;i<n;i++)
        {
            if(meet.get(i).start > f)
            {
                c++;
                f = meet.get(i).end;
            }
        }
        return c;

        
    }
    public static void main(String[] args) {
        int start[] = {1,0,3,8,5,8};
        int end[] = {2,6,4,9,7,9};
        int n = 6;
        System.out.println(countOfMeetings(start, end, n));


        /*
            comparator in java : 1 means swap, -1 means DONOT swap
        */

    }
}