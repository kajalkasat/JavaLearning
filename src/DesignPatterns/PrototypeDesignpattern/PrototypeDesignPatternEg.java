package DesignPatterns.PrototypeDesignpattern;

import java.util.*;

class Home implements Cloneable{

    List<String> l;

    public Home()
    {
        l = new ArrayList<String>();
    }

    public Home(List<String> l2) {
        this.l = l2;
    }

    public void insertData()
    {
        l.add("kitchen");
        l.add("door");
        l.add("bedroom");
        l.add("bathroom");
    }

    public List<String> getHomeDets()
    {
        return l;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        List<String> l2 = new ArrayList<String>();

        l2.addAll(l);

        return new Home(l2);
    }
}

public class PrototypeDesignPatternEg
{
    /*
        when the original object is created, we should not modify the changes on this object
        we should create a new object, by copying the content of the original object(cloning) and make our changes

        hence, when we want to avoid multiple object creation of same instance, then we create a copy
        of the original object and make our changes there
        below, original object = kajal and new object = rohit
    */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Home kajal = new Home();
        kajal.insertData();

        System.out.println(kajal.getHomeDets());

        Home rohit = (Home) kajal.clone(); // return type of clone() is object 
        List<String> b = new ArrayList<String>();
        b = rohit.getHomeDets();
        b.add("terrace");

        System.out.println(kajal.getHomeDets());
        System.out.println(b);

        Home chit = (Home) rohit.clone();
        List<String> c = chit.getHomeDets(); // cannot do .remove() here, as .remove() return boolen data type and c is List<>
        //c = chit.getHomeDets();
        c.add("overhead tank");

        chit.getHomeDets().remove("door");
        System.out.println(c);

    }
}