package Introduction;

import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

            // for(int i=1;i<=n;i++)
            // {
            //     for(int j=1;j<=n-i;j++)
            //     {
            //         System.out.print("  "); // we have to o/p 2(n-i) spaces, if we run the loop once, and print space twice like "  ", its same as 2(n-i) spaces
            //     }

            //     for(int j=1;j<=i;j++)
            //     {
            //         System.out.print(" *  "); // 2 spaces between every star
            //         //System.out.print("*  "); print this line and check, why 1 more space is added
            //     }

            //     System.out.println();
            // }

            int num = 1;

            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print("  ");
                }

                for(int j=1;j<=i;j++)
                {
                    System.out.print(" "+num+"  ");
                    num = num+1;
                }

                System.out.println();
            }
        }
 
}
