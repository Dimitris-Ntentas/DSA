package linkedList;

public class Main {

    public static void main(String[] args) {

        if (args.length > 1)
            System.out.println(args[1]);
        LinkedList list = new LinkedList();
        list.insert(8);
        list.insert(19);
        list.insert(12);

        list.insertAtStart(5);
        list.insertAt(2, 25);
        list.deleteAt(0);

        list.display();

        list.reverse();
        list.display();
    }
}
