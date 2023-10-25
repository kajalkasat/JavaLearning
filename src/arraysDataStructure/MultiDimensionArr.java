package arraysDataStructure;

import java.util.Scanner;

public class MultiDimensionArr {
    public static void main(String[] args) {
        
        /*
            int[][] arr = new int[5][3];
            5 -> no of rows
            3 -> no of coloums
        */
        
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int col = sc.nextInt();

        int a[][] = new int[rows][col];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }


    }
}
