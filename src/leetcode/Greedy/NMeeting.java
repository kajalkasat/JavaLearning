package leetcode.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class meeting
{
    int st;
    int en;
    int pos;

    meeting(int st,int en, int pos)
    {
        this.st = st;
        this.en = en;
        this.pos = pos;
    }
}

class myComparator implements Comparator<meeting>
{
    public int compare(meeting m1, meeting m2)
    {
        if(m1.en<m2.en)
            return -1; // donot swap
        else if (m1.en > m2.en)
            return 1; // swap m1, m2 based on end values
        else if(m1.pos > m2.pos)
            return 1;
        else 
            return -1;

    }

    
  
}
public class NMeeting
{
    public static int NMeetingVal(int start[], int end[], int N)
    {
        ArrayList<meeting> al = new ArrayList<meeting>(N);

        for(int i=0;i<N;i++)
        {
            al.add(new meeting(start[i], end[i], i+1));
        }

        Collections.sort(al, new myComparator());

        int de = al.get(0).en;
        int c = 1;
        for(int i=0;i<N;i++)
        {
            if(al.get(i).st > de)
            {
                c++;
                de = al.get(i).en;
            }
        }

        return c;
    }


    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int N = 6;

        int ans = NMeetingVal(start,end,N);
        System.out.println(ans);
    }
}