package oOps.exceptionHandling;

public class MainClass {
    
    public static void main(String[] args) {
        
        fun1();
        /*
            try - the code that might be wrong or give some errors
            after try, catch or finally is compulsory

            finally block : will execute always if present no matter what; whter ctach is caught or not

            throw : throw exception from block or method

            throws: method based
        */

        // try{
        //     int a =5;
        //     int b = 0;

        //     int c = a/b;

        //     System.out.println(c);
        // } 
        
        
        // catch(ArithmeticException e) // e is an object, having a lot of debug info like where error occured what error occured
        // {
        //     System.out.println(e.getMessage()+"please check your code");
        // }
    }


    static void fun1()
    {
        int a=5;
        int b=3;
        int c = a/b;

        boolean isDanger = true;

        if(isDanger)
        {
            throw new ArrayIndexOutOfBoundsException("danger gone back");

            // exception object is to be created when we create any exception, so new keyword
        }
    }
}
