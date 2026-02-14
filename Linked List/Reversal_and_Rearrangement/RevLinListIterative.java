package Reversal_and_Rearrangement;

public class RevLinListIterative {
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev =null;
        ListNode curr= head;

        while (curr!=null){
            ListNode next = curr.next;
            curr.next= prev;
            prev = curr;
            curr =next;
        }
        return prev;
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
        ListNode head = new ListNode(10);
        head.next= new ListNode(25);
        head.next.next= new ListNode(40);
        head.next.next.next =new ListNode(65);
        head.next.next.next.next =new ListNode(80);
        System.out.println("Original Linked List:");
        printlist(head);
        head= reverseList(head);
        System.out.println("\nReversed Linked List:");
        printlist(head);
    }
}

/*
Note for me:
reverseList is main reversing logic
So,
curr here mean node currently being processed
prev already reversed portion
next saves remaining list
So, i start with an empty reversed list.Because the new tail (node 1) must point to null. prev = null
curr starts at the first node , curr = head
prev = null
curr = 1 -> 2 -> 3 -> 4 -> 5 -> null
then , while loop while (curr != null) contition.
I process nodes one-by-one until the list ends.
ListNode next = curr.next;
save remaining list - next = 2 -> 3 Because the next line is going to break the original link.
curr.next = prev;
means 1 will be null
prev = curr;
then current is curr = next;
this is first iteration, doing same for each
Now:
So, main logic here is to loop repeatedly remove first node from remaining list and push it to front of reversed list
 */