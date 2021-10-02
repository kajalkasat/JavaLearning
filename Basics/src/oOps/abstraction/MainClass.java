package oOps.abstraction;

public class MainClass {

public static void repairCar(Car car) // car is "Car.java" class object
{
    System.out.println("car is repaired");
}

    /*
        Abstraction : to hide complexity of code from outside world
            -> real life : jab hum kuch app bana dete hain user ko bas app use karne se matlab hain
                wo kese bana, kya hua wo hidden rehta hain matlab complexity hidden 
        
        abstraction is achieved with abstract classes and interfaces
    */
    public static void main(String[] args) {
        
    
    Wagonr w = new Wagonr();
    Audi a = new Audi();

    // Car c = new Car(); // not possible, as "Car" class is abtract, we cannot create its objects

    repairCar(w); /* for wagonr repaired, and it will be valid for "Car.java" class argument in 
                    repaircar as Wagoner and Audi extends Car */
    repairCar(a);

    /*
        difference between abstraction and encapsulation
        encapsulation : data is hidden for security reasoons; to avoid unauthorised access
                        (same cheezein ek saath rakhi hain; jo closely related hain)
        abstraction : data is hidden for reducimg complexity
    */
    }
}