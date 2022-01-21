package leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
 
import collectionsDS.ObjectClass.Pair;

public class Arraylistcollec {
    
    /*
        why array list ?
            -> arrays are of fixed size, array list allow dynamic size
            -> arraylist create re-sizeable arrays ?????
                -> it internally uses array, as we put in elements it increases its size (makes it double)
                -> this is internal, once the threshold is reached, it makes its size double
        
        Generics :
        -> ArrayList<Type> al = new ArrayList<>()
        -> type : is for keeping the same type for all elements in the array list; this is generics
    */
public static void main(String[] args) {


    ArrayList<String> fruits = new ArrayList();
    fruits.add("abc");
    // fruits.add(23); // this line will throw error, because generics say String, but we passed int parameter
    System.out.println(fruits);

    // now we made pair as generic, and defined below
    Pair<String,Integer> p = new Pair<String,Integer>("abc",1); // Pair<String,Integer> p = new Pair("abc",1) // this is also correct
    Pair<Boolean,Integer> p1 = new Pair<Boolean,Integer>(true, 2);
    p.Description();
    p1.Description();


    List<String> l1 = new ArrayList<>(); // defining this way will make, the conversion of l1 from ArrayList to Stack or other class implementing List
    
    List<String> l2 = new LinkedList<>();

    l1.addAll(l2); // to add collection

    l1.add("abcd");
    l1.add("def");
    l1.add("hij");
    l1.add("def");
    System.out.println(l1.get(0));

    l1.set(1, "potato");
    
    List<String> l3 = new ArrayList<>();
    l3.add("abcd");
    l3.add("def");
    
    l1.removeAll(l3); // this will remove thode elements from l1, that we pass in l3
    System.out.println(l1);
    System.out.println("l1 ka size: "+l1.size());
    System.out.println(l1.contains("def"));
    System.out.println(l1.isEmpty());
    

    // Object x[] =  l1.toArray(); // this would return an object, but if we want to convert to string as l1 is string then its below

    String temp[] = new String[l1.size()]; 

    l1.toArray(temp);

    for(String e : temp)
    {
        System.out.print(e+ " ");
    } 


    List<Integer> ll = new ArrayList<>();

    System.out.println(ll.size());
    
}
    
}
