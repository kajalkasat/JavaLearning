package oOps.finalKeyword;

public class Student {
    
    final int ROLL_NO;  
    final String NAME;
    static String work;

    // this is called initialiser block
    {
        ROLL_NO = 2;
     /* can be used to initialise this way, or in the constructor like NAME is done
        NAME = "SS";
        work = "ws";
    */
    }


    public Student()
    {
        NAME = "myname";
    }


}
