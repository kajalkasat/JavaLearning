package oOps.learningOops;

import java.util.*;
class Employee
{
    int id;
    String name,dept;

    Employee(int id, String name, String dept)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}

public class equalsandhascode{
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "abc", "tech");
        Employee e2 = new Employee(101, "abc", "tech");
       
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        // the hashcode of e1 and e2 are different

        Map<Employee,Integer> mp = new HashMap<Employee,Integer>();
        mp.put(e1, 1);
        mp.put(e2, 1);
        System.out.println(mp.size()); // the size is 2 even though both the e1 and e2 are same values

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2)); 

        /*
            when the hashcode is same, we have to override the hashcode() in such a way that
            if two employees are same, then they should have the same hashcode
            the issue is as they have different hascodes they are getting stored in different buckets

            if 2 objects have same hashcode are they equal? no
            viceversa is true
        */
    }
}