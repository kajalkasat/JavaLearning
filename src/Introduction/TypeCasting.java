package Introduction;

public class TypeCasting {
    public static void main(String[] args) {
        
        /* we can type cast in 2 ways : widening  &  narrowing
            BOOLEAN CANNOT BE TYPECASTED
        */

        /*  WIDDENING */
        // byte x = 2;
        // int val = x;  x and val both printed 2

        /* int x = 222;
         long val = x;  // double val = 222.0 and long val = 222 */

        /* NARROWING */
        double d = 234.96;
        int val = (int) d;
        System.out.print(val); // val printed 234
        // if val 234.96 or 234.15 the integer conversion  is 234 only
        // because in java it takes floor 

        System.out.print('\n');
        
        System.out.print(d);
           
    }
}
