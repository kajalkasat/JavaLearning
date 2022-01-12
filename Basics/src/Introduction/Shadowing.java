package Introduction;

public class Shadowing {
    
    static int a = 10; // scope of a starts from here, this gets shadowed at line 11
    public static void main(String[] args) {
        
        System.out.println(a);
        int a; 
        // System.out.println(a); //this gives error as scope of variable begins when value is initialised 
        a = 20; /* this 'a' scope is within main()
        the class variable in line 5, is shadowed by this*/
        System.out.println(a);
        fun();
    }

    static void fun()
    {
        System.out.println(a); // here takes the global variable scope
    }
}
