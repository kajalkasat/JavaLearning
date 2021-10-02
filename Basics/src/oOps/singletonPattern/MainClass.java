package oOps.singletonPattern;

public class MainClass {
    
    // AppConfig obj = new AppConfig(); // not possible becase AppConfig construtor is made private

    AppConfig obj = AppConfig.getInstance();
}
