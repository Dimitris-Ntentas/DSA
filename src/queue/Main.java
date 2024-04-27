package queue;

public class Main {

    public static void main(String[] args) {

        Queue q = new Queue(7);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeuing element: " + q.dequeue());

        System.out.println("Size: " + q.getSize());

        q.display();
    }
}
