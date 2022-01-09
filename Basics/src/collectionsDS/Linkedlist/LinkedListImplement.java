package collectionsDS.Linkedlist;
import java.util.*;
public class LinkedListImplement {
 
    Node head;
    void add(int data)
    {
        Node toAdd = new Node(data);
        if(head == null)
        {
            head = toAdd;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = toAdd;     
    }

    void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    // the basic constructor
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedListImplement l = new LinkedListImplement();
        l.add(2);
        l.add(4);
        l.add(6);
        l.print();
    }
}
