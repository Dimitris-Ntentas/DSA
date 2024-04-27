package stack;

public class Main {

    public static void main(String[] args) {

        Stack nums = new Stack(5);

        System.out.println("Stack empty: " + nums.isEmpty());
        System.out.println("Stack size: " + nums.size());

        nums.pop();

        nums.push(7);
        nums.push(13);
        nums.push(10);
        nums.push(10);
        nums.push(10);
        // Triggers expansion
        nums.push(10);

        System.out.println("New size: " + nums.size());

        nums.pop();
        nums.pop();
        nums.pop();

        nums.show();

        System.out.println("Popped: " + nums.pop());
        System.out.println("Top element: " + nums.peek());
        nums.show();
    }
}
