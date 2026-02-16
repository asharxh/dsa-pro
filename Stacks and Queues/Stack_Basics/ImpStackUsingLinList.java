package Stack_Basics;

class StackL {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackL() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed Into stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is Empty");
            return -1;
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }

        Node temp = top;
        System.out.println("stack Elements:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class ImpStackUsingLinList {
    public static void main(String[] args) {
        StackL stack = new StackL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("popped element: " + stack.pop());
        System.out.println("top element: " + stack.peek());
    }
}

