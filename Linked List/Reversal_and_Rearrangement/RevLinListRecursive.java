package Reversal_and_Rearrangement;

public class RevLinListRecursive {
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode reverseList(ListNode head){

        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void printlist(ListNode head){
        ListNode temp= head;

        while (temp!=null){
            System.out.print(temp.val+ "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next= new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next =new ListNode(4);
        head.next.next.next.next =new ListNode(5);
        System.out.println("Original Linked List:");
        printlist(head);
        head= reverseList(head);
        System.out.println("\nReversed Linked List:");
        printlist(head);
    }
}


/*
Note for me:
In reverses the list starting from the 2nd node onward,
then attaches the first node at the end.
 */