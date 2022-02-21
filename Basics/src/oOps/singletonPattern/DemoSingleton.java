package oOps.singletonPattern;

public class DemoSingleton {

    private static DemoSingleton single_instance = null;
    int i;

    private DemoSingleton() {
        i = 90;
    }

    public static DemoSingleton getInstance() {
        if (single_instance == null) {
            single_instance = new DemoSingleton();
        }
        return single_instance;
    }

    public static void main(String args[]) {
        DemoSingleton first = DemoSingleton.getInstance();
        System.out.println("First instance integer value:" + first.i);

        first.i = first.i + 90;
        
        DemoSingleton second = DemoSingleton.getInstance();
        System.out.println("Second instance integer value:" + second.i);
    }
}
