package collectionsDS.ObjectClass;

import java.util.ArrayList;
import java.lang.*;

public class ObjectClassDSoft { 
    
    String name;
    int rollno;

    ObjectClassDSoft(String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }

    // uncomment this overriden toString() and check output
    // as we have overriden, ou implementation of toString() will be used

    // public String toString()
    // {
    //     return name + " "+ rollno;
    // }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
    
    if(obj == this) // o4.equals(o2) , these cases always return true, as both are same references
        return true;
    
    if(obj instanceof ObjectClassDSoft)
    {
        String name1 = this.name; // name and this.name both point to 1st object of .equals() 
        int rollno1 = this.rollno;

        ObjectClassDSoft s = (ObjectClassDSoft) obj; // as obj is Object type we cannot access name and roll no, so typecast
        String name2 = s.name;
        int rollno2 = s.rollno;

        if(name.equals(name2) && rollno==rollno2) // name and rollNo is same like name1 and rollno1, both point to 1st object of .equals() 
            return true;
        else
            return false;
    }
    
    else
        return false;

    }
    public static void main(String[] args) {
        
        ObjectClassDSoft o1 = new ObjectClassDSoft("Durga", 101);
        ObjectClassDSoft o2 = new ObjectClassDSoft("Ravi", 102);
        System.out.println(o1); // classname@hexa_decimal_in_hexadecimalform
        System.out.println(o1.toString());

        Integer i = 1;
        System.out.println(i); /* here also toString() is overriden to get proper content 
        and not like classname@hexa_decimal_in_hexadecimalform */

        ArrayList<Character> l = new ArrayList<Character>();
        l.add('A');
        l.add('B');
        System.out.println(l); // [A,B]

        System.out.println(o1.equals(o2));
        ObjectClassDSoft o3 = new ObjectClassDSoft("Durga", 101);
        ObjectClassDSoft o4 = o2;
        System.out.println(o1.equals(o3));
        System.out.println(o4.equals("Ravi")); // the typecasted line raises exception as only name is there no roll no
                                                // hence instanceOf will handle these, or we can use try catch block
        System.out.println(o2.equals(null)); 
        System.out.println(o4.equals(o2));





        
    }
}
