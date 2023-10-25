package stringDs;

public class StringIntro {
    
    public static void main(String[] args) {

        String s = "Kajal"; /* this way of declaration is called string literals 
                               it will create a string in string pool area,
                               if another string say String s2 = "Kajal" is created, 
                               so both s and s2 will point to the same Kajal, double copies are not created
                               this way of inititlaisation checks, if the value if previously available in string 
                               pool area, then same is used */

        String s1 = new String("Kajal"); /* this way of declaration will create object of this string in heap area
                                            and a copy in string pool area
                                            now, if we again say String s3 = new String("Kajal")
                                            then, s3 will be created again in the heap area,
                                            and the string pool area will reuse the s1 string as they
                                            are having same value  */

        /* so, if the string value doesnt bother, then we should always go for string literals 
        initialisation, as its more effecient
        but if the values matter, then new kewyword is prefferable


        STRING IN JAVA ARE IMMUTABLE means once defined cannot be changed
        

        */

        if(s.equals(s1)) // returns true, read output
        {
            System.out.println("s==s1 is true, we are same as we have same content, but point to different object");
        }


        System.out.println(s==s1); /* returns false, as "s" is in string pool area and "s1" is in heap area
                                    */
        
        String s3 = "Kajal";
        String s4 = "Kajal";
        System.out.println(s3==s4); /* return true as both are from string pool area,
                                     that is s3 and s4 point to the same object */

        String s5 = "immutable";
        s5 = "value";
        System.out.println(s5); /* strings are immutable, so "immutable" is not removed from,
                                 sring pool "immutable" is kept there, s5 is made to "value" 
                                 although "immutable" will be removed (covered under garbage collection)*/

        String s6 = new String("Java"); 
        String s7 = new String("Java"); 
        System.out.println(s6==s7);  /* returns false, why ? both are in the heap area
                                        so probably they point to different object 
                                        different locations, unlike s3 and s4*/

        String test = "Testing the values";

        System.out.println("charat : "+test.charAt(5));
        System.out.println("length of test string : "+test.length());
        
        System.out.println("test.substr : "+test.substring(2,5)); // 2,3,4 is counted, and 5 is not --> 2 to (5-1) 
        
        System.out.println("test.contains:"+test.contains("z"));
         
        String test2 = "";
        System.out.println(test2.isEmpty());
        System.out.println(test.isEmpty());

        System.out.println(test.replace("I", "pp")); // case sesitive is checked

        /*  split : if we want to split a string some expression like below 
        basically a big string into separate words or arrays
        (regex) - regular expression */

        String cars = "Kia,Hyundai,Lamborghini,Wagonr";
        String allCars[] = new String[1]; // it worked how ? 
        
        System.out.println("length of all cars now :"+allCars.length);
        

        allCars = cars.split(",");
        System.out.println("length of all cars now :"+allCars.length);
        for(String e : allCars)
        {
            System.out.print(e+" ");
        }
        
        System.out.println();
        System.out.println(test.indexOf("z")); /* return first index only and case sensistive handled
                                                not found = -1 */

        System.out.println("OINJNJ".toLowerCase());

        System.out.println("xsjxnsjxn".toUpperCase());

        /* trim :  removes the trailing spaces in front and end of string*/
        System.out.println("   jcndjcnjdncjd      ".trim()); 
        
        String s945 = "Goldmansachs";
        String p = s945;
        s945 = "Goldman";

        System.out.println(s945+" "+p);
    }
}
