package inheritance;

public class MainClass {
    public static void main(String[] args) {
     
        Inheritance2 o2 = new Inheritance2();
        o2.walk(); // method overriding, same func in parent and sub class, same signature and parameter of the function 

        // upcating 
        // inheritance 2 is inheritance 1 as inheritance2 extends inheritance 1
        Inheritance1 o1 = o2;

        o1.talk();

        // downcasting 
        // inheritance3 is inheritance1 but inheritance 1 maybe inheritance3, so this has to be expicityly mentioned

        Inheritance3 o4 = new Inheritance3();
        Inheritance1 o5 = o4;
        Inheritance3 o6 = (Inheritance3) o5;

        boolean yo = o6 instanceof Inheritance3; // to check for if the object is correct instance
        System.out.println(yo);

        // super class : calls immediate parent class

    }   
}
