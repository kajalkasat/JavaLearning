package leetcode.Map;

import java.util.HashMap;
import java.util.Map;

public class FractiontoRecurrDecimal{
    
    public static String fractionToDecimal(int num, int den) {
     
        StringBuilder s = new StringBuilder();
        
        if(num == 0 )
        {
            s.append("0");
            return s.toString();
        }
        
        long numerator = num; // converted to long before because : -1 -2147483648  : was failing for
        // math.abs(-2147483648) but after converting to long it converted -2147483648 to +2147483648
        long denominator = den;
        
        if( (numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))
            s.append('-');
        
        
        numerator = Math.abs(numerator); // abs for cases like -4/333 would return -0.(0-1-2) otherwise
        denominator = Math.abs(denominator);

        long q = numerator / denominator;
        long r = numerator %  denominator;
        
        s.append(Long.toString(q));
        
        if(r == 0) // to maintain the answer in case of whole no like 2/1 = 2
        {
            
            return s.toString();
        }
        
        s.append('.');
        
        Map<Long,Integer> mp = new HashMap<Long,Integer>();
        
        int len;
        while(!mp.containsKey(r) && r!=0)
        {
            
            
            
            len = s.length();
            mp.put(r,len);
            r = r*10;
            q = r / denominator;
            r = r % denominator;
            
            s.append(Long.toString(q));
        }
        
        if(mp.containsKey(r) && r!=0)
            {
                s.insert(mp.get(r),"("); // suring insert use "" as insert(Integer,object) and object cannot be char
                s.append(')');
                
            }
        
        return s.toString();
    }

    public static void main(String[] args) {
        
        String ans = fractionToDecimal(-1, -2147483648);
        System.out.println(ans);
    }
}