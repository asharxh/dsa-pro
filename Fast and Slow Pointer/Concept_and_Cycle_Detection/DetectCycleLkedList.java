package Concept_and_Cycle_Detection;

public class DetectCycleLkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n3;

        Solution sol = new Solution();
        boolean result = sol.hasCycle(n1);

        System.out.println("Cycle Present: " + result);
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

class Solution{
    public boolean hasCycle(ListNode head){
        if(head ==null || head.next==null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null&&fast.next!=null){
            if(slow==fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}



/*
Note for me :
Use 2 Pointer starting from same head node but different speed
slow pointer move 1 node per step
fast pointer move 2 node per step
remember:  fast and slow mostly used in singly linked list to extract info list
without knowing length and extra memory cost.
slow = slow.next
fast = fast.next.next
Cyclic linked list mean loop back to previous node.
No cycle exists means fast reaches NULL, if cycle fast laps slow and they meet (slow == fast).
if cycle-->
k = nodes before cycle
c = cycle length
 */