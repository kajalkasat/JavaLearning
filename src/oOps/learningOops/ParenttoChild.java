package oOps.learningOops;

// Class 1
class A {
}
 
// Class 2
class B extends A {
}

class Parent{
    int a,b;
    Parent()
    {

    }

    public A demo()
    {
        System.out.println("parent class demo");

        return new A();
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

    public B demo()
    {
        System.out.println("child class demo");
        return new B(); // overriden methods with different return types : covariant return types
        // over here we can have B as return type because B has prop. of A and B
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
        
        //Child c = new Parent(10, 20);
        /*
        gives error because Parent class has a,b whereas child class has a,b,x,y
        meaning child class access to both child class and parent class entities,
        whereas parent class has access only to parent class entities
        hence parent class doesnt instantiate child class entities, and it cannot be accessed
        */

        Parent p = new Child(15,30);
        //System.out.println(p.x); //p is a parent object, and has access only to parent class entitities
        p.demo(); 
        /* in case of overriden method, the most dervied method is called, like demo() 
        is mot overriden in child class */

        //System.out.println(c.a);
    }
}
