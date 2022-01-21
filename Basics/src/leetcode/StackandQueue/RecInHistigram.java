package leetcode.StackandQueue;
import java.util.Stack;
public class  RecInHistigram{
    
    public static void main(String[] args) {
        
        int heights[] = {2,1,5,6,2,3};

        int lsi[] = new int[6];
        int rsi[] = new int[6];
        int n = 6;
        Stack<Integer> s = new Stack<>();
        lsi[0] = 0;
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
            {
                s.pop();
                
            }
            if(s.isEmpty())
                lsi[i] = 0;
            else
                lsi[i] = s.peek();
            
            s.push(i);
        }

        while(!s.isEmpty())
        {
            s.pop();
        }
        
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i])
            {
                s.pop();
            }
            
            if(s.isEmpty()) 
            {
                rsi[i] = n;
            }
            else
            {
                rsi[i] = s.peek();
            }
            s.push(i);
        }

        for(int e : lsi)
        {
            System.out.println(e);
        }
    }
}