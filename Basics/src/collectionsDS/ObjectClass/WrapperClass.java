package collectionsDS.ObjectClass;

public class WrapperClass {
    public static void main(String[] args) {
        

    /*
        1) wrapper classes are like Integer is wrapper class for primtive type int
        2) wrapper classes are used to wrap primitives into object 
        3) wrapper class are used to provide utility methods to convert primitives
            eg: we want to convert int to String
                String s = Integer.toString(10);
        
        what is autoboxing ans autoUnboxing?
            -> upto version 1.4 java, we cannot use primitve data type (boolean) in place of
                wrapper object(Boolean) and vice versa
            -> after 1.4, this conversion is handled automatically which is called autoboxing and
                autoUnboxing
                -> autoboxing : primitive to wrapper object like Integer i = 10;(10 is primitive and i is object)
                                compiler converts int to Integer autmatically 
                                the compiler calls it like Integer i = valueOf(10);
                -> autoUnboxing : wrapper object to primitive like
                                    Integer I = new Integer(10);
                                    int i = I; // automatic conversion by compiler from wr. obj to primitive
                                                i = I.intValue() happens internally  
    */
    }
}
