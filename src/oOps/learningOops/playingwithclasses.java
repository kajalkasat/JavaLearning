package oOps.learningOops;

import sortingTechniques.*;
public class playingwithclasses {

    private int n = 1;
    public void method1()
    {
        System.out.println(n + "method1 executed");
    }

    public static void main(String[] args) {
        /*  
            class modifier:
            1. if the class is public : accessible anywhere
            2. if default : only in the package
            3. if abstract : we cannot instantiate (create objects of this class)
            4. if final : we cannot extend the class
            5. top level class can be : public, default, abstract, final
                inner class can be : toplevel+ private, protected, static (this is NOT applicable for top level class)

            
            1. if the class2 in pack2 is NOT public, we cannot access the public methods from class2
            visibility of class matters more than visibility of members
            2. a members(method / variable) is considered to be default is we donot specify any access modifier
            3. a default member can be accessed only in the package its declared in, irrespective of 
            visibility of class
            4. protected : <default> + child classes 
            if a variable is proctected, we can access it within the same packages, and outside of the package
            its accessile only by child classses (also only when the child class object, calls the method
            the parent object reference to child class calling this method is not allowed)
            

        */

        playingwithclasses p = new playingwithclasses();
        p.method1(); // its recommended, to have variables as private and methods as public

        BubbleSort p2 = new BubbleSort(); // check this by uncommenting constructor in Bubblesort()


    }
}
