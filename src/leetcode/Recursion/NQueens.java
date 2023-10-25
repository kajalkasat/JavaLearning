package leetcode.Recursion;

import java.io.*;
import java.util.*;
public class NQueens {
    public static List<List<String>> solveNQueens(int n) 
    {
        char board[][] = new char[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              board[i][j]='.';   
            }
           
        }
        
        List<List<String>> ans = new ArrayList<>();
        recursq(ans,n,0,board);
        return ans;
    }

    
        static boolean isSafe(char[][] board, int row,int col)
        {
            int i = row;
            int j = col;
            
            // check for left sides only as towrds right wr are moving so its going to emoty now
            // left
            for(j = col;j>=0;j--)
            {
                if(board[row][j]=='Q')
                {
                    return false;
                }
            }
            
            //left top diagonal
            i = row;
            j = col;
            while(i>=0 && j>=0)
            {
                if(board[i][j]=='Q')
                {
                    return false;
                }
                i--;
                j--;
            }
            
            // left bottom diagonal
            i = row;
            j = col;
            while(i<board.length && j>=0)
            {
                if(board[i][j] == 'Q')
                {
                    return false;
                }
                i++;
                j--;
            }
           
            return true;
        }
        
        public static void recursq(List<List<String>> ans, int n,int col,char[][] board)
        {
            if(col == n)
            {
                ans.add(make(board));
                return;
            }
            
            for(int row=0;row<n;row++)
            {
                if(isSafe(board,row,col))
                {
                    board[row][col] = 'Q';
                    recursq(ans,n,col+1,board);
                    board[row][col] = '.';
                }
            }
            
        }
        
        // to form the list from a given string
        public static List<String> make(char[][] board)
        {
            List<String> res = new ArrayList<String>();
            for(int i=0;i<board.length;i++)
            {
                
                String s = new String(board[i]);
                res.add(s);
                
            }            
            return res;
        }
        
    public static void main(String[] args) {
        
        int n = 4;
        List<List<String>> fin = solveNQueens(n);
        
        for(int i=0;i<fin.size();i++)
        {
            System.out.println(fin.get(i));  // print an arraylist
        }


        List<Integer> g = new ArrayList<>();
        g.add(10);

        System.out.println(g);              // print a list
    }
}
