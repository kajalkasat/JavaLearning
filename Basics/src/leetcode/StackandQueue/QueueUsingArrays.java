package leetcode.StackandQueue;

/*
queue : FIFO
*/
class Queue
{
    int arr[] = new int[5];
    int front,back;
    Queue()
    {
        front=-1;
        back=-1;
    }    

    void push(int x)
    {
        if(back==4)
        {
            System.out.println("queue is full");
            return;
        }
        back++;
        arr[back] = x;
        if(front == -1) // this step so that we mark we have added the first element 
            front++;
    }

    int pop()
    {
        if(front == -1 || front>back)
        {
            System.out.println("queue is empty");

        }
        int x = arr[front];
        ++front;
        return x;
    }

    boolean isEmpty()
    {
        if(front == -1 || front>back)
            return true;
        else
            return false;
    }

    void print()
    {
        for(int i=front;i<=back;i++)
        {
            System.out.println((i+1)+"th:"+arr[i]);
        }
    }
}
public class QueueUsingArrays {
    
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.push(1);
        // q.push(2);
        // q.push(3);
        // q.push(4);
        // q.push(5);
        System.out.println("pop:"+q.pop());
        q.print();
        System.out.println(q.isEmpty());
    }
}
