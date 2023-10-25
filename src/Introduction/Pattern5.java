package Introduction;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=1;i<n;i++)
        {

            if(i<=1)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=2*(i-1) && j<n;j++)
            {
                if(j==1||j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print("* ");
        }
    }
}
