package Basics_and_Traversal;

public class FindMax {

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

        if(head==null) return;

        int max=head.data;
        Node temp = head;

        while(temp !=null){
            if(temp.data > max){
                max = temp.data;
            }
            temp = temp.next;
        }
        System.out.println(max);

    }
}


//Note for me :
//To find sum of all elements:
//sum += temp.data; }
//temp = temp.next;

/*
Check Empty :
if(head==null)
 */