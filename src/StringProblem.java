import java.util.*;

//class test
//{
//    try {
//
//    } catch (Exception e) {
//
//    }
//}
public class StringProblem
{
    static String isValid(String str)
    {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            Character ch = str.charAt(i);
            if((Character.isLetter(ch) == true)|| (Character.isDigit(ch) == true))
                ans.append(ch);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
/*
    "This is my string"

    string
    o/p -> str

    token = Ffihg567ADFSKJbn

    "My name is Kajal working in Temenos%^&*("
    BW - working , Temenos
    o/p - working --> work

    1. find the bggest word in string
    2. Replace with the matching char presnt in biggest word and print the word
    3. If the word containds any special char don't consider it as biggest word
*/

    

    String str = "My name is Kajal working122 in Temenos%^&*(";

    int n = str.length();
    String token = "Ffihg567ADFSKJbn";
    Set<Character> set = new HashSet<>();
    for(char ch : token.toCharArray())
    {
        set.add(ch);
    }

    String arr[] = str.split(" ");

    int maxLength = Integer.MIN_VALUE;

    String biggest = new String();
    for(String string : arr)
    {
            String valid = isValid(string);
            
            if(valid.length() > maxLength)
              {
                biggest = valid;
                maxLength = valid.length();
              }  

    }
    
    StringBuilder answer = new StringBuilder();

    
    for(char ch : biggest.toCharArray())
    {
        if(!set.contains(ch))
            answer.append(ch);
    }

    System.out.print(answer.toString());

    }

    

}


