package DesignPatterns.BuilderDesignPattern;

class Vehicle // the outer class can have ONLY getter, inner should have setter
{
    private int engine;
    private int wheels;
    private String fuel;

    private int airbags;

    public int getEngine()
    {
        return this.engine;
    }

    public int getWheels()
    {
        return this.wheels;
    }

    public String getFuel()
    {
        return this.fuel;
    }

    public int getAirBags()
    {
        return this.airbags;
    }
    private Vehicle(VehicleBuilder b) // private because we donot want it to be accessible from outside
    {
        this.engine = b.engine;
        this.wheels = b.wheels;
        this.fuel = b.fuel;
        this.airbags = b.airbags;
    }

    static class VehicleBuilder // the static inner class for builder pattern
    {
        private int engine,wheels,airbags; // these cannot be used from the outer class
        

        private String fuel;
        

        public VehicleBuilder(int engine, int wheels, String fuel) // important parameters
        {
            this.engine = engine;
            this.wheels = wheels; 
            this.fuel = fuel;
        }

        public VehicleBuilder SetAirbags(int airbags) // optional parameters
        {
            this.airbags = airbags;
            return this; // return is required as retur type "VehicleBuilder" is mentioned, and its required because when we access setAirbags in main()
        }

        public Vehicle build()
        {
            return new Vehicle(this);
        }

    }

}
public class BuilderPattern {
    
    /*
        why?
            -> used when we have to send too many arguments to contructor and maintaining the order is difficult
            -> when we dont want to send all the parameter in object initialisation
                so we can send only the required parameters, the optional ones are taken care by builder pattern by passing them thro' setter methods 

        implementation:
            -> we create a 'static nested class', which contains all arguments of outer class -> this is builder class
            -> if class name = "College", builder class name = "CollegeBuilder"
            -> builder class have a public constructor with all required parameters
            -> builder class should have setter methods, that return builder object, for optional parameters
            -> build() returns the final object 

    */
    public static void main(String[] args) {
        
        /*
        Vehicle v = new Vehicle();
        Vehicle.VehicleBuilder vb1 = v.new VehicleBuilder(); --> if vehicle builder was a member class and not static class, we have to instatiate the object
        of Vehicle class first and then the inner class for reference(the left side of =) and 
        for object the object of Vehicle class will create the object of inner class

        hence, by making Vehicle builder static, we chave to reference it like member class, but object creating is not required, we can directly use the class as static is related to class
        */
        
        Vehicle kia = new Vehicle.VehicleBuilder(1000, 4,"petrol").SetAirbags(1).build(); // by making inner class static we can access it by using the class name only
        Vehicle activa = new Vehicle.VehicleBuilder(250, 2, "diesel").build();

        System.out.print(kia.getEngine());
        System.out.print(" "+kia.getWheels());
        System.out.print(" "+kia.getFuel());
        System.out.print(" "+kia.getAirBags());

        System.out.println();

        System.out.print(activa.getEngine());
        System.out.print(" "+activa.getWheels());
        System.out.print(" "+activa.getFuel());
        System.out.print(" "+activa.getAirBags());

    }



}
