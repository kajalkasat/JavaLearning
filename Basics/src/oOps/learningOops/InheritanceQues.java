package oOps.learningOops;


class outer
{
    class Inner2{
        public void made()
        {
            System.out.println("inner.outer without static");
        }
    }
    static class Inner{
        public static void made()
        {
            System.out.println("inner.outer with static");
        }
    }
}

public class InheritanceQues {

    class Base {
        public static  void show() {
           System.out.println("Base::show() called");
        }
    }
       
    class Derived extends Base {
        public  static void show() {
           System.out.println("Derived::show() called");
        }
    }
       
    
    
        public static void main(String[] args) {
            InheritanceQues obj = new InheritanceQues();
            // first need an instance of object of enclosing class
            Base b = obj.new Derived(); //Now you are able to create an instance of inner class that is connected with an instance of enclosing InheritanceQues class

            //in case of runtime polymorphism, the object created takes the most dervied overriden method.

            b.show(); // as the method show() is static it calls parent class


            outer o1 = new outer();
            outer.Inner o2 = new outer.Inner();
            o2.made();
            outer.Inner2 o3 = o1.new Inner2();
            o3.made();
            
        }
    
}
