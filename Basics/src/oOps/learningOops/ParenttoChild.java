package oOps.learningOops;

class Parent{
    int a,b;
    Parent()
    {

    }

    public void demo()
    {
        System.out.println("parent class demo");
    }
    

    public Parent(int a,int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("parent con");
    }
}

class Child extends Parent{

    int x,y;

    public void demo()
    {
        System.out.println("child class demo");
    }

    public Child(int x,int y)
    {
        
        this.x = x;
        this.y = y;
        System.out.println("child con");
    }
}
public class ParenttoChild {
    public static void main(String[] args) {
        
        Child c = new Parent(10, 20); 
        /*
        gives error because Parent class has a,b whereas child class has a,b,x,y
        meaning child class access to both child class and parent class entities,
        whereas parent class has access only to parent class entities
        hence parent class doesnt instantiate child class entities, and it cannot be accessed
        */

        Parent p = new Child(15,30);
        System.out.println(p.x); //p is a parent object, and has access only to parent class entitities
        p.demo(); 
        /* in case of overriden method, the most dervied method is called, like demo() 
        is mot overriden in child class */

        System.out.println(c.a);
    }
}
