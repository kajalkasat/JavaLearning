package oOps;

public class StaticKeyword {
    
    /* A obj1 = new A();
    A.B obj2 = obj1.new B(); // A.B -> B is inside A, and obj1.new because new obj of B can be created only if object of A is there
                            // or we could import oOps.A.B to import class B, instead of A.B 
    This shows B is closely coupled to A
    */

    // A.C objc = new A.C();  // directly thro' "new" we could create object for class C by calling thro' A, creating ovject of A is not requied
    // A and C are not tightly coupled like A and B, we write A.C to show the encapsulation 
    // A.C objc = : A.C here can be like C objc = if we import oOps.A.C for importing class C
    // static blocks are all executed in order of call, and then main() 

    static
    {
        System.out.println("static block 1");
    }

    static
    {
        System.out.println("static block 2");
    }
    public static void main(String[] args) {
      System.out.println("main block");  
    }

    static
    {
        System.out.println("static block 3");
    }

}
