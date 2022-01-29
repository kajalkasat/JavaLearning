package Introduction;

public class StringMutability {
    
    public static void main(String[] args) {
        
        /*
            string are immutable in java ?
            when strings are created without the new keyword, its created in string pool area,
            the string pool area caches the string object hence, if many string have the same value,
            a single string value object is created and its pointed by those many strings


        */

        String s1 = "bcbdch";
        s1.concat("dcd");
        System.out.println(s1); // this prints only bcbdch, as the strings are immutable, hence the s1 is 
        // is not modified, instead an new object of s1 is created first and then concatenated, and 
        // this new object(bcbdchdcd) doesnot have any reference to it, hence s1 remains unchanged actually

        String s2 = s1.concat("uhhwu"); // we are creating a reference for s1
        System.out.println(s2); 

        String s4 = "abc";
        String s3 = new String("abc").intern(); // to access the string pool object when using new keyword

        System.out.println(s4 == s3); // returns true as s4 is in string pool area, and s3 also points to object in string pool area

        String s5 = new String("jcjc");
        s5.concat("njnjd");
        s5 += "vfv"; // this will append to the string
        System.out.println(s5);

    }
}
