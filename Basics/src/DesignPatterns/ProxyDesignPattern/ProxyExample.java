package DesignPatterns.ProxyDesignPattern;

interface Database 
{
    public void DatabaseOutput(String query) throws Exception; // this method cannot be static
}

class show implements Database
{
    @Override
    public void DatabaseOutput(String query) throws Exception { // "throws Exception" has to added to all the methods/ classes where use this method
        System.out.println("WRITE INTO abc.xml");
    }
}

class ProxyClass implements Database
{
    
    boolean isadmin;
    
    show db = new show();

    public ProxyClass(String username, String pwd)
    {
        if(username == "admin" && pwd == "123456")
        {
            isadmin = true;
            
        }
    }

    /*
        objects in the main() are instantiated for proxyclass
        databaseoutput() is called for proxy class, if the user is admin we allow the execution of the query from the database query implementation (show class)
    */
    @Override
    public void DatabaseOutput(String query) throws Exception {
        
        if(isadmin == true)
        {
            db.DatabaseOutput(query);
        } 
        else
        {
            if(query == "WRITE")
                {
                    throw new Exception("write for this user is not allowed");
                }
            else
                {
                    db.DatabaseOutput(query);
                }
        }
    }
    
}

public class ProxyExample {
    
    /*  
        used when we want to control acesss/ restrict the access
        like writing into db is applicable only to admin users and not other users

        implementation :
        the proxy class should implement the same interface/class of the database_user
        and write conditions for admin users with the accessibility
    */
    public static void main(String[] args) throws Exception
    {
        

        Database o1 = new ProxyClass("admin", "123456");
        o1.DatabaseOutput("WRITE");

        Database o2 = new ProxyClass("inputt", "123456");
        o2.DatabaseOutput("WRITE");

        

    }
}
