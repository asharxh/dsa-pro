package Basics_and_Traversal;

public class JavaLinkedListManual {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    private Node head;

    public void  insertAtBeginning(int data){
        Node newnode = new Node(data);

        newnode.next=head;
        head=newnode;
    }

    public void insertAtEnd(int data){
        Node newnode = new Node(data);

        if(head==null){
            head=newnode;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void insertAtPos(int data, int position){
        Node newNode = new Node(data);

        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp = head;
        for(int i =1; i<position-1 && temp!=null; i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        newNode.next = temp.next;
        temp.next =newNode;
    }

    public void delfromBeg(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
    }

    public void delfromEnd(){
        if(head==null){
            System.out.println("List is emplty");
            return;
        }
        if(head.next ==null){
            head=null;
            return;
        }
        Node temp = head;

        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public boolean search(int key){
        Node temp = head;

        while (temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public void display(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        JavaLinkedListManual list = new JavaLinkedListManual();

        list.insertAtBeginning(30);
        list.insertAtBeginning(10);
        list.insertAtEnd(60);
        list.insertAtEnd(50);
        list.insertAtPos(20,2);

        System.out.println("Linked List:");
        list.display();

        list.delfromBeg();
        list.delfromEnd();
        System.out.println("After Deletions");
        list.display();

        if(list.search(40)){
            System.out.print("40 found in list");
        }
        else {
            System.out.println("40 not FOund");
        }
    }
}
