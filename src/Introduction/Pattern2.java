package Introduction;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /* for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1;j++)
            {
                if(j==n+1)
                {
                    System.out.print(i);
                
                }
                    else if(j<=i)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        } */

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>j) 
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
