package oOps.polymorphism;

public class MainClass {
    
    public static void main(String[] args) {

        // these lines cannot be out of main()
    Dog d = new Dog();
    
    Pet p = d; // upcasting

    // variables are never overidden, only methods are overriden
    System.out.println(p.name);
    System.out.println(d.name);

    // runtime polymorphism, as at runime only p underatands that is a dog object, so its dynamic / late binding 
    // only methods are overriden, like walk() in dog 
    p.walk();
    d.walk();
    }
    
}
