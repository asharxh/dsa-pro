package Stack_Basics;

class StackR {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackR(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top== maxSize - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i= top; i >=0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    public void insertAtBottom(int value) {
        if (isEmpty()) {
            push(value);
            return;
        }
        int temp = pop();
        insertAtBottom(value);
        push(temp);
    }

    public void reverseAStack() {
        if (isEmpty()) {
            return;
        }

        int temp= pop();
        reverseAStack();
        insertAtBottom(temp);
    }

    public void findMiddleIterative() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        int size = top + 1;
        int middle = size / 2;
        StackR tempStack = new StackR(maxSize);
        for (int i = 0; i < middle; i++) {
            tempStack.push(pop());
        }
        int middleElement = pop();
        System.out.println("middle element: " + middleElement);
        push(middleElement);
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stackArray[top];
    }

    public void deleteMiddle() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int size=top+1;
        deleteMiddleUtil(size, 0);
    }

    private void deleteMiddleUtil(int size, int current) {
        int temp=pop();
        if (current ==size/2) {
            return;
        }
        deleteMiddleUtil(size, current + 1);
        push(temp);
    }

    public void sortStack() {
        if (!isEmpty()) {
            int temp =pop();
            sortStack();
            sortedInsert(temp);
        }
    }
    private void sortedInsert(int value) {
        if (isEmpty() || value> peek()) {
            push(value);
            return;
        }
        int temp= pop();
        sortedInsert(value);
        push(temp);
    }
}

public class RevMidSortStack {
    public static void main(String[] args) {
        StackR stackR = new StackR(10);

        stackR.push(11);
        stackR.push(28);
        stackR.push(31);
        stackR.push(60);
        stackR.push(23);
        stackR.push(81);
        stackR.push(35);
        stackR.push(91);
        stackR.push(9);
        System.out.println("original Stack:");
        stackR.display();
        stackR.reverseAStack();
        System.out.println("reversed stack: ");
        stackR.display();
        stackR.findMiddleIterative();
        stackR.deleteMiddle();
        stackR.display();
        stackR.sortStack();
        System.out.println("Stack is sorted: ");
        stackR.display();
        System.out.println("top element: " + stackR.peek());
    }
}


/*
Note for me:
To find Middle Element inn Stack i used iterative approach, for more optimal use recursive is best.
 */
