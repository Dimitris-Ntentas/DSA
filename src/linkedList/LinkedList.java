package linkedList;

public class LinkedList {

    Node head;

    public void insert(int data) {

        Node node = new Node(data);

        if (head == null)
            head = node;
        else {
            Node run = head;
            while (run.next != null) {
                run = run.next;
            }
            run.next = node;
        }
    }

    public void insertAtStart(int data) {

        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {

        if (index == 0) {
            insertAtStart(data);
            return;
        }
        Node node = new Node(data);
        Node run = head;

        while(index > 1) {
            run = run.next;
            index--;
        }
        node.next = run.next;
        run.next = node;
    }

    public void deleteAt(int index) {

        Node delete;

        if (index == 0) {
            head = head.next;
        } else {
            Node run = head;

            while (index > 1) {
                run = run.next;
                index--;
            }
            run.next = run.next.next;
        }
    }

    public void display() {

        Node node = head;

        while (node.next != null) {

            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println(node.data + " -> null");
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
