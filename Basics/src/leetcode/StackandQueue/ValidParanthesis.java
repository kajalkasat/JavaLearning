package leetcode.StackandQueue;

// TC -> O(n)
// SC -> O(n) 
import java.util.Stack;
public class ValidParanthesis {

    public static boolean isValid(String s) {
        int n = s.length();
        
        if(s.isEmpty() || n==0 || n==1)
            return false;
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                st.push(s.charAt(i));
            else if(s.charAt(i)==')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            {
                if(st.isEmpty())
                    return false;
                if(st.peek()=='(' && s.charAt(i) == ')')
                    st.pop();
                else if(st.peek() == '{' && s.charAt(i) == '}')
                    st.pop();
                else if(st.peek() == '[' && s.charAt(i) == ']')
                    st.pop();
                else 
                    return false;
            }
        }
        
        if(st.size()==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String s = "((";
        System.out.println(isValid(s));
    }
}
