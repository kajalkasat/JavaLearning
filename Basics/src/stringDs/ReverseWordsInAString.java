package stringDs;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        
        String s = "I am, a code           ";
        String ans = "";
        /*
        this code couldnot handle the cases where space are in between the words : "I     am code"
        
        String arr[] = new String[s.length()];
        arr = s.split(" ");
        String res = "";
        for(int i=arr.length-1;i>=0;i--)
        {
            res += arr[i];
            res += " ";

        }

        res.trim();
        System.out.println(res);
        */

        int i = s.length()-1;
        while(i>=0)
        {
            while(i>=0 && s.charAt(i) == ' ')
                i--; // to handle if the spaces are at the end
            
            if(i<0)
                {
                    break; // to handle when space are present in the first part, before the first word
                            // in that case i will reach -1, and j will reach 1, so 1 space will be added 
                }
            int j = i;
            while(i>=0 && s.charAt(i) != ' ')
                i--;
            
            /*   is blue        ____
                                i
                       j (j=i)
                i            
            */



            if(ans.isEmpty())
                ans += s.substring(i+1, j+1);       
            
            else
                {
                    ans += " ";
                    ans += s.substring(i+1, j+1);       
                }

        }

        System.out.println(ans);
    }    
}
