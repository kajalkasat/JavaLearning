package oOps;

class Cat 
{
    // these are state 
    boolean hasFur;
    String color , breed;
    int legs, eyes;

    public void walk()
    {
        
        System.out.println("cat chal rahi hain");
    }

    public void eat()
    {
        System.out.println("cat kha rahi hain");
    }

    public void desciption()
    {
        System.out.println("my cat has " + legs + " legs and "+ eyes +" eyes");
    }
}

public class MainClass {

    public static void main(String[] args) {

       
        Cat c1 = new Cat(); // how to create an object of class
        c1.legs = 2;
        c1.eyes = 2;
        c1.desciption();

        Cat c2 = new Cat();
        c2.legs = 4;
        c2.eyes = 2;
        c2.desciption();

        c2.walk();



    }
}
