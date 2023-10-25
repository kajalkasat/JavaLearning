package stringDs;

public abstract class Anagram {
 public static void main(String[] args) {
     
    /* Anagram ?
        2 strings are same --> same characters occuring same no of times
        basically twins   
        example : silent and listen
    */

    String s1 = "silent";
    String s2 = "listen";

    // the below code returns YES, the repeating characters are not handled in the below code
    // so added isVisited, 
    // TC : O(n*n)
 
     if(s1.length() != s2.length())
        System.out.println("NO");
        
    /*
    boolean isAnagram = false; 
    boolean isVisited[] = new boolean[s1.length()];
                        
    for(int i=0;i<s1.length();i++)
    {
        char c = s1.charAt(i); // s[i] is written as s.charAt(i)
        isAnagram = false; // if its true first and then false, then true will consdered,
                            // so at every iteration make it false 
        
        for(int j=0;j<s2.length();j++)
        {
            if(s2.charAt(j) == c && !(isVisited[j]))
            {
                isVisited[j]=true;
                isAnagram = true;
                break;

            }
            
        }

        if(!isAnagram)
            break; // no point continiuing if any character was not found
    }

    if(isAnagram)
        System.out.println("YES");
    else
        System.out.println("NO");

    */
else
{
    boolean isAnagram = true; 
    int al[] = new int[256]; /* 256 because, string can contain uppercase, lowercase, special chars
                                nos, so ascii table has 256 chars and we consider all
                                for every char, its corresponding ascii value be incremented 
                                count of occourence for every char in s1 will be stored in al
                                and s2 in bl
                                if these arrays are equal, its a anagram, else not */
    //int bl[] = new int[256];

    for(char c : s1.toCharArray()) // s1 is not a char array, its a string so convert to char array
    {
        int index = c; // ascii value of character is in index (char to int can be automatic conversion, as int > char)
        al[index]++;

    }

    for(char c : s2.toCharArray())
    {
        // int index = (int) c;
        // bl[index]++;

        /* trick */
        int index = c;
        al[index]--;
    }

    for(int i=0;i<256;i++) // al.length = 256
    {
        if(al[i] != 0)
        {
            isAnagram = false;
            break;
        }
    }

    if(isAnagram)
        System.out.println("YES");
    else
        System.out.println("NO");


    /* trick to solve this is we can 
        use 1 array al alone for storing char count of string s1 and s2, instead of having al and bl
        how?
        iterate over string s1, and store count of chars at respective ascii indexes
        iterate over string s2, and minus by 1, for every char's repective ascii index
        if all elements in al are 0, then its a anagram, else not
    */
    }   
 }
}
