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

    Pet p1 = new Dog();
    
    /*
        -> Pet p1 = new Dog();
        -> this means p1 is of reference variable type which is pet and not dog
        -> p1 will have access only to Pet class objects, here its the concept of overriding for walk()
        hence dog's class walk() is called
        -> Parent obj = new Child() --> here which method will be called depends on child
        this is upcasting, thats how overriding works
        say for Pet p1 = new Dog(), the walk() is called from where depends on dog()
        although p1 will access only to pet class, but walk() is overriden hence its from dog()
        ->since overriding depends on object, and static depends on class and not object, static
        cannot be overriden


        -> Dog d = new Pet(); --> this is not possible, because the child properties are not accessible to parent

    */

    /*
        types of polymorphism:
        1. compile time polymorphism / static polymorphism:
            -> achieved via method overloading
            -> method overloading means same method name different params,
            -> java determines which consturctor/method based on no. of params of object be called at compile time

        2. runtime polymorphism / dynamic polymorphism
            -> achieved by method overriding
    */
    }
}
