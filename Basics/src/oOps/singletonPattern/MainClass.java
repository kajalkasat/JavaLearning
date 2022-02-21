package oOps.singletonPattern;

public class MainClass {
    
    public static void main(String[] args) {
        
        AppConfig obj = AppConfig.getInstance();
        AppConfig obj1 = AppConfig.getInstance();

        System.out.println(obj); // both obj and obj1 will have the same value as only 1 instance is created
        System.out.println(obj1);
    }
    // AppConfig obj = new AppConfig(); // not possible becase AppConfig construtor is made private

    
}
