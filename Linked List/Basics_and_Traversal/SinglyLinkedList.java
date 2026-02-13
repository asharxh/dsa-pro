package Basics_and_Traversal;

import jdk.dynalink.beans.StaticClass;

public class SinglyLinkedList {

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

        System.out.println("Linked List Traversal: ");

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
