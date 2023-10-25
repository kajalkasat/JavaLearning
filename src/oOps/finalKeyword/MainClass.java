package oOps.finalKeyword;

public class MainClass
{

    final int VARFIN_1 = 2; // VARFIN_1 has to be initialised as its made final here
    
    public static void main(String[] args) {
        
     
    /*
        final can be used with : variable , class and method 
        final syntax : all CAPS

        if final is used with 
            -> variable : its value is final, cannot be changed
            -> class : cannot be extended 
            -> method : cannot be overriden
        
        -> final variable if assigned cannot be reassigned, basically can be assigned once
        -> final variable is called blank, if not initialised like VARFIN_2

        -> finalize : is called when java destroys the object; its a part of garbage collection such that
        the objects with no reference variable pointing to it, has to be removed

        finalize() is called by GC just before collecting object for GC.
        present in java.lang.Object
        it provides last chance to cleanup and free any remanining resources
        cleanup means garbage collector by JVM collects only those ovjects that are created using new 
        keyword, so if we want to remove objects that are no longer under use and created without new
        you can destroy those from finalize()
        
    */
    final int VARFIN_2; // not initialising final here is alright
    
    /* 

    Student2 obj1 = new Student2();
    Student2 obj2 = new Student2();

    obj1 = obj2;  /* now obj will store reference of obj2 and obj2 obviously will store reference of obj2
                   if obj1 is made final : 
                   " final Student2 obj1 = new Student2(); "
                   then this not possible as reference of obj1 would be fixed */
    

    final Student2 obj1 = new Student2();
    Student2 obj2 = new Student2();

    obj1.name = "name2"; // this is allowed only reference changing is not allowed
    // obj1 = new Student2(); // this is not allowed, when a non-primitive is final, it cannot be reassigned


    }
}