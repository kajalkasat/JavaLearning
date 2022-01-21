package oOps;

// import arraysDataStructure.FirstArray;
/* if we want to access some function of other class in other pacakges then we can use import*/
class Vehicle
{
    int wheels;
    String model;
    // Vehicle(int w)
    // {
    //     wheels = w;
    //     // wheels = w, is clear that we get w in parameter call and set to wheels, depending on the parameter
    
    // }
    

    /* in case, we want w and wheels to have same name, then how will we understand the difference ? */
    Vehicle(int wheels)
    {
        this(4,"truck"); // how we call constructor from another constructor
        // internally its like Vehicle(4,"truck")

        // wheels = wheels // we cannot differeciate which is the state/ data member and which is parameter
        this.wheels = wheels; // this will referrence to the current object , points to current obj
        // internally means like car.wheels = "wheels in the constructor parameter"
        
        //this(4,"truck"); // error  : Constructor call must be the first statement in a constructor
        
    }

    Vehicle(int wheels,String model)
    {
        this.wheels = wheels;
        this.model = model;
    }
}
public class MyConstructor {
    MyConstructor()
    {
        System.out.println("Constrcutor call");
    }
    public static void main(String[] args) {
        
       // MyConstructor obj = new MyConstructor();

       Vehicle car = new Vehicle(5);
       // Vehicle scooter = new Vehicle(); // uncomment and check here
        /* AFTER DEFINING CNSTRUCTORS, ITS NOT POSSIBLE TO CALL DEFAULT CONSTRUCTOR 
        we need to then define default constructor if at all we want to call, because
        compiler considers it to be overridden by the constructor we created
        SEE Scooter*/
      
       System.out.println(car.wheels);

    }
}