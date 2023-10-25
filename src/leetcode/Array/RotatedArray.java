package leetcode.Array;

import java.lang.reflect.AnnotatedArrayType;
import java.util.*;
public class RotatedArray {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> ans = new ArrayList<Integer>();
        
        int n = a.size();
        int d1 = d%n;
        Collections.reverse(a); // 5 4 3 2 1
        
        for(int i = d1-1;i>=0;i--)
        {
            ans.add(a.get(i));
        }   
        for(int i = n-1;i>=d1;i--)
        {
            ans.add(a.get(i));
        }
        return ans;
        }
        public static void main(String[] args) {
            List<Integer> a = Arrays.asList(41, 73 ,89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51);
           
            List<Integer> ans  = rotLeft(a, 10);
            for(int i : ans)
            {
                System.out.print(i+"  ");
            }


        }
}