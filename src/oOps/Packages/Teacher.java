package oOps.Packages;

import oOps.Packages.Models.Student;
/* if we want to access some function of other class in other pacakges then we can use import*/

/*
    Default : visible in the package and class only 
    private : only within the class, toooo restricted
    protected : jaidad; only to child 
    public : accessible everywhere, inside and outside the package

    why encapsulation ? 
        -> keeps the code clean, by keeping related fields or methods together
        -> ek class ka kaam koi aur nahi kar rahi, uniqueness 
    
    
    
*/
public class Teacher {
    public static void main(String[] args) {
        Student s = new Student();
        // s.no; // cannot access as "no" is private
        s.name = "Tom"; // as name is public
    }
}
