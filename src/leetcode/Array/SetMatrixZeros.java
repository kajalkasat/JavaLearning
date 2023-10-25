package leetcode.Array;

public class SetMatrixZeros
{
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k=0;k<n;k++)
                    {
                        matrix[i][k]=0;
                    }
                    for(int l=0;l<m;l++)
                    {
                        matrix[l][j]=0;
                    }
                  
                }
                
            }
        }
    }


    public static void main(String[] args) {
        
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}