package oOps.singletonPattern;

public class AppConfig { 
    
    private AppConfig()
    {
        /* so object for AppConfig are not created, we have to allow only 1 object in
        singleton pattern, see below the static obj beign return thro' getInstance() 
        
        implementation:
        1. make the constructor private(so that we can create only 1 instance)
        2. public method for returning instance
        3. instance type : private static
        */
    }


    private static AppConfig obj = new AppConfig();

    public static AppConfig getInstance()
    {
        return obj;
    }
}
