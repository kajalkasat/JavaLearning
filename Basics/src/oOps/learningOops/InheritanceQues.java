package oOps.learningOops;

public class InheritanceQues {
    class Base {
        public static void show() {
           System.out.println("Base::show() called");
        }
    }
       
    class Derived extends Base {
        public static void show() {
           System.out.println("Derived::show() called");
        }
    }
       
    
    
        public static void main(String[] args) {
            InheritanceQues obj = new InheritanceQues();
            // first need an instance of object of enclosing class

            Base b = obj.new Derived(); //Now you are able to create an instance of inner class that is connected with an instance of enclosing InheritanceQues class

            b.show(); // as the method show() is static it calls parent class
        }
    
}
