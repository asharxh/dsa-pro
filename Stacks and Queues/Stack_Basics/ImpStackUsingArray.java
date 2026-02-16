package Stack_Basics;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("stack Ooverflow");
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack Is empty");
            return -1;
        }
        return stackArray[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}

public class ImpStackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("pop element: " + stack.pop());
        System.out.println("top element: " + stack.peek());
    }
}
