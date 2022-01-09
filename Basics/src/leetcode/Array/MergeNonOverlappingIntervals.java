package leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;

class Interval
{
    int start,end;
     
    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}
public class MergeNonOverlappingIntervals {
    
    static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        if(intervals == null || intervals.size() == 0)
        {
            intervals.add(newInterval);
            return intervals;
        }
        
        Interval toInsert = newInterval;
        int i=0;
        while(i<intervals.size())
        {
            Interval currInterval = intervals.get(i);
            if(currInterval.end < toInsert.start)
            {
                i++;
                continue;
            }
            else if(toInsert.end < currInterval.start)
            {
                intervals.add(i,toInsert);
                break;
        
            }
            else
            {
                toInsert.start = Math.min(toInsert.start,currInterval.start);
                toInsert.end = Math.max(toInsert.end,currInterval.end);
                intervals.remove(i);

            }
        }
    
        if(i==intervals.size())
        {
            intervals.add(toInsert);
        }

        return intervals;
    }

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));

        Interval newInterval = new Interval(2, 5);

        ArrayList<Interval> ans = insert(intervals,newInterval);

        for(Interval e : ans)
        {
            System.out.println(e.start + " " + e.end);
        } 

    }
}
