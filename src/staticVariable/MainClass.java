package staticVariable;

class Demo
{
    int num1;
    static int num2;

    public void works() {
        num2=9;
    }

    public static void notWorks()
    {
        //num1++;
    }
}

public class MainClass {
    
    /*
        static : need class to call variables and methods
        non- static : need object of class to call variables and methods

        we can use a static variable inside a non-static method;because all non-static members share the same static variables 
            -> see works() in Demo class and it can be called in main()
        we cannot use non-static variable inside static method
            -> see notWorks() in Demo class and when we call in main(), which object will be used d,d1 or d2, hence this is not possible

    */
    public static void main(String[] args) {
     
        Demo.num2 = 2; // as num2 is static

        Demo d = new Demo();
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        
        d.works();
        Demo.notWorks();// which vaibale will be incremented, d or d1 or d2 ?; not known
        

        // as num1 is non-static, created object of class
        d.num1 = 3;
        d1.num1 = 4;
        d1.num1 = 5;
        


    }
}
