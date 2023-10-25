package interfaces;
/*

    Java cannot support multiple inheritance, it can support multiple interfaces 
    here, student can be a youtuber and a youtuber can be a student , this becomes "can be" relationship
    and not "is a" relationship (inheritance requires is a relationship)

     person wants to be both youtuber and student
     if youtuber and student are classes we cannot extend them together

     make the youtuber and Student classes as Youtuber and Student interfaces, and then person
     can implement them, as interfaces are implemented by class

     Interfaces are like abstract classes, methods here by default are public and abstract
    if implemented then its methods have to be overriden

    why use interface ?
        -> interfaces provide specifications, which a class that implements it must follow 
            (like person has to implement study() and makeVideo())
        -> helps achieve abtraction
        -> multiple inheritance is not possible because of diamond problem, but multiple interface is possible (functionality of multiple inheritance is allowed)
    
    Drawbacks :
        -> interfaces cannot be used to create objects like Youtuber y = new Youtuber(); 
            interfaces cannot be instantiated matlab new keyword cannot be used
            because interface doesnot have any constructor or any implementation
        -> be default, interface attributes like int x =5; are public, static and final
        -> " , methods are abstract and public.
        -> interface cannot extend another class but can extend multiple interfaces
        -> if we donot want to implement the study() and makevideo() from Student and Youtuber interfaces,
            then make Person class abtract, and then we cannot create p 
            now some other class wants to implement these, then it has to extend Person and override methods in it
        -> Abstract interafces cannot have concrete methods (methods with implementations)
        -> Abstract interafces can have default implemenation for concrete methods
            pro : to avoid implementing this method in the classes or interfaces implementing this interfaces
            cons : its prone to diamond problem, as this is not true abstraction

*/
public class Person implements Student, Youtuber{

    public static void main(String[] args) {
        Person p = new Person();
        p.makeVideo();
        p.study();
    }

    @Override // annotation
    public void study() {
        System.out.println("person is studying");
        
    }

    @Override
    public void makeVideo() {
        System.out.println("person is making video");
        
    }

    // @Override
    // public void myVideo() {
    //     // TODO Auto-generated method stub
        
    // }
     

}
