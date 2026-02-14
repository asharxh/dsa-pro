package Basics_and_Traversal;

public class TraverseAndLen {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(40);
        Node fourth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        Node head = first;

//        System.out.println("Traverse Linked List: ");
        System.out.println("Length of Linked List");

        Node temp = head;

//        while(temp!=null){
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");

        int length = 0;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        System.out.println(length);
    }
}
