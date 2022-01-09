package collectionsDS.Linkedlist;
class ListNode 
    {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

public class RevereseLinkedList
{
    public static ListNode reveredlist(ListNode head)
    {
        ListNode prev = null;
        ListNode curr;
        while(head!=null)
        {
            curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;
        }
        
        return prev;
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == null || head.next == null)
        {
            return true;
        }
        
        while(fast!=null && fast.next!=null) //add 1 more .next
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // head is 1->2->5->2->1
        slow = reveredlist(slow);
       // slow becomes 1->2->5, head is 1->2->5

       /* to check the slow and head values
       while (slow!=null)
       {
           slow = slow.next;
       }

       while(head!=null)
       {
           head=head.next;
       }
        */

        // slow has now reached middle, head is not changed
        while(head!=null)
        {
            if(head.val != slow.val)
            {
                return false;  
            }
            slow=slow.next;
            head=head.next;
        }
        
        return true;
    }

    public static void print(ListNode head)
    {
        while(head!=null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static void main(String[] args) {
      
    
        ListNode head = new ListNode();
        head.val = 1;
        ListNode head2 = new ListNode();
        head.next = head2;
        head2.val = 2;
        ListNode head3 = new ListNode();
        head2.next = head3;
        head3.val = 5;
        ListNode head4 = new ListNode();
        head3.next = head4;
        head4.val = 2;
        ListNode head5 = new ListNode();
        head4.next = head5;
        head5.val = 1;
        

        System.out.println(isPalindrome(head));



    }
} 