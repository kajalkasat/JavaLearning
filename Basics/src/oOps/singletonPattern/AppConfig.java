package oOps.singletonPattern;

public class AppConfig { 
    
    private AppConfig()
    {
        /* so object for AppConfig are not created, we have to allow only 1 object in
        singleton pattern, see below the static obj beign return thro' getInstance() */
    }


    private static AppConfig obj = new AppConfig();

    public static AppConfig getInstance()
    {
        return obj;
    }
}
