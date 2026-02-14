package Basics_and_Traversal;

public class LinkedListDeletion {
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null)
            temp = temp.next;

        temp.next = newNode;
    }

    static void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void delAtPos(int pos){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(pos==1){
            head=head.next;
            return;
        }
        Node temp = head;

        for(int i =1; i<pos-1 && temp.next != null; i++){
            temp = temp.next;
        }

        if(temp.next==null){
            System.out.println("Position out of range");
            return;
        }
        temp.next=temp.next.next;
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        System.out.println("Original List: ");
        display();

        int pos = 3;
        delAtPos(pos);

        System.out.println("After Deleting pos " + pos + ":");
        display();
    }
}


/*
Note for me:
Head is position 1, so pos 3 means 30
I create 3 methods insert, display and delete.
Insert to insert element in linked list, display to show linked list after insertion
FOR deletion i cant del node directly like array, i have to del by modifying a pointer
like previous node to del node.next . So, i used temp it will connect pointer of 20 to 40
20.next = 40
therefore node 30 is disconnected.
I dont have to worry about it because java gc will remove it automatically
It means i never removed a node i only change links . skip one node in chain
 */