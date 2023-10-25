package DesignPatterns.FactoryDesignPatters;
 
abstract class Colleges // the class has to be abstract so it can have implementation classes
{
    abstract int noOfCourses();

    @Override
    public String toString()
    {
        return "no of courses" + this.noOfCourses();
        
    }

}

class Srm extends Colleges
{
    int count;
    Srm(int count)
    {
        this.count = count;
    }
    
    public int noOfCourses()
    {
        return this.count;
    }
}

class Vit extends Colleges
{
    int count;
    Vit(int count)
    {
        this.count = count;
    }

    @Override
    int noOfCourses() {
        return this.count;
    }
}

class CollegesFactoryClass 
{
    public static Colleges getInstance(String name, int c) // made static so we cam access inside main for instantiation
    {
        if(name == "Srm")
        {
            return new Srm(c);
        }
        else if(name == "Vit")
        {
            return new Vit(c);
        }

        return null;
    }
}

public class FpExample {

    public static void main(String[] args) {
        
        Colleges c = CollegesFactoryClass.getInstance("Srm", 50);
        Colleges c1 = CollegesFactoryClass.getInstance("pfg", 250);
        Colleges c2 = CollegesFactoryClass.getInstance("Vit", 150);
        System.out.println(c); // internally toString() is called, as we have defined here the overriden toString() gets called
        System.out.println(c1);
        System.out.println(c2);
    }
}