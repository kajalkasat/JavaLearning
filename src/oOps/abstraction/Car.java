package oOps.abstraction;

public abstract class Car {
    static int x = 10;
    /* inside car class, accelerate and brake are not implemented (lines inside cusrly brace)
     because the car is only a car, we cannot buy car, we can buy audi car or wagonr car
     so when we cannot buy car we cannot accelearte car, no sense in this */
    
    // public void accelerate(); // uncomment this and check why we add abstract

    public abstract void accelerate();
    public abstract void brake(); // Car class also has to made abstract "The abstract method brake in type Car can only be defined by an abstract class"
    
    /* why this ? 
        -> now because car is only a concept, object of car or any method definition inside car cannot be there
        -> so we will use abstract only when we know we are going to create children of this abstract class, basically class extending this abstract class
        -> children class extending these has to compulsorily override these methods in them
        -> abstract class has to be extended and abstract methods have to overriden in these class that extend abstract class
    */

    // this is called concrete method, a non-abstract method inside abstract class, yes possible
    public void honk()
    {
        System.out.println("car is honking");
    }

    // inner class in abstract class
    static abstract class Inner
    {
        public void inner1()
        {

        }
        public abstract void inner2();
        public void honk() {
        }

        
    }
}
