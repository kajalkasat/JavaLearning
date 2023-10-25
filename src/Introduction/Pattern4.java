package Introduction;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            } 


            System.out.println();
        }

        while(n-1!=0)
        {
        for(int i=n-1;i>=1;i--)
        {
            System.out.print("* ");
        }
        System.out.println();
        n--;
    }
    }
}
