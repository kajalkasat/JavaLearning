package encapsulationData;

public class Encapsule {
    public static void main(String[] args) {
        
        EncapsuleStudent e = new EncapsuleStudent();

        // cannot access these directly, as they are private so scope is class restricted
        // e.rollNo = 22;
        // e.name = "Chitransh";

        /*
        Encapsulation ? 
            -> make variables private like in EncapsuleStudent
            -> make getters and setters public, and use them to write and read data
        Encapsulations helps achieve data hiding is not itself data hiding
        Encapsulation helps restrict modification of code
        */

        e.setRollNo(25);
        System.out.println(e.getRollNo()); // to print roll no, we use GET

    }
}
