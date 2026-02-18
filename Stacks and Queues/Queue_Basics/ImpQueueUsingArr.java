package Queue_Basics;

class MyQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public MyQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front= 0;
        rear= -1;
    }

    public boolean isEmpty() {
        return (rear < front);
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("queue is full");
            return;
        }
        arr[++rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front++];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }

        for (int i = front; i<=rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ImpQueueUsingArr {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.enqueue(7);
        q.enqueue(22);
        q.enqueue(38);
        q.enqueue(5);
        q.display();
        q.dequeue();
        q.display();
    }
}


/*
Note for me :
for insertion (Enqueue) and Deletion (Dequeue)
Queue follow FIFO (First In First Out) approach
front points to first element
rear points to last element
size
array[]
 */