package queue;

public class Queue {

    private int capacity;
    private int[] queue;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public Queue() {

        this.capacity = 5;
        queue = new int[capacity];
    }

    public Queue(int capacity) {

        this.capacity = capacity;
        queue = new int[capacity];
    }

    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue is full!");
            System.out.println("Cannot enqueue " + data + "!");
            return;
        }
        queue[rear] = data;
        rear++;
        size++;
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            System.out.println("Nothing to dequeue!");
            return -1;
        }
        int data = queue[front];
        queue[front] = 0;
        front++;
        size--;
        return data;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            System.out.println("Nothing to display!");
            return;
        }

        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " | ");
        }
        System.out.println();
    }

    public boolean isEmpty() {

        return getSize() == 0;
    }

    public boolean isFull() {

        return getSize() == capacity;
    }

    public int getSize() {

        return size;
    }
}
