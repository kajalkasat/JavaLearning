package Introduction;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // double y = sc.nextDouble();

        //String s = sc.nextLine(); // for string (NON-PRIMITIVE DATA TYPE)
        //character : char c = sc.nextLine().charAt(0); --> gets the 1st character of string s

        /* int p = 213;
        float r = 12f; // if we donot give fits taken as double by compiler, if we want float we should 
                        // add f or type cast manually like (float) 12;
        int t = 2;
        float s = (p*r*t)/100;
        */

        int p = sc.nextInt();
        float r = sc.nextFloat();
        int t = sc.nextInt(); 

        float s = (p*r*t)/100;
        
        System.out.println(s); 

    }
}
