package Merging_Intersection_and_Sorting;

public class RemoveDuplicate {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }


    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head ==null) return null;

            ListNode current = head;
            while (current != null && current.next!= null) {
                if (current.val== current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val);
            if (temp.next!= null) {
                System.out.print(" -> ");
            }
            temp= temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        System.out.println("Original List:");
        printList(head);
        Solution solution = new Solution();
        head = solution.deleteDuplicates(head);
        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}

/*
Note for me:
The main removal logic in linked list is to skip it, and connect pointer of curr to next.next.
In java garbage collector will automaticallu remove that skiped node. I dont have to worry about it. It becomes eligible for garbage collection
So, current.next = current.next.next; this code will skip duplicate when if condition satisfy.
else, move forward normally. It same like printing linked list but here skipping dupli.
 */
