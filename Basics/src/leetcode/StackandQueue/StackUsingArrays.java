package leetcode.StackandQueue;

import java.io.*;
import java.util.*;

/*
stack : LIFO

daily life examples : plates in the wedding
peek : returns only the top values, thats the only use

*/
class Stack
{
    int top;
    int arr[] = new int[5];
    Stack()
    {
        top = -1; // declare empty stack
    }

    void push(int v)
    {
        if(top==4) 
        {
            System.out.println("limit crossed");
            return;
        }
        else
        {
            top++;
            arr[top] = v;
        }
    }

    boolean empty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }

    int pop()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
        {
            int ans = arr[top];
            top--;
            return ans;
            
        }
    }

    int peek()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
        {
            int ans = arr[top];
            return ans;
            
        }
    }

    void print()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println((i+1)+"th:"+arr[i]);
        }
    }
}
public class StackUsingArrays
{
    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        s.print();      
    }
}