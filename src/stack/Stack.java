package stack;

public class Stack {

    private int capacity;
    private int[] stack;
    private int top = 0;

    public Stack() {

        capacity = 5;
        stack = new int[capacity];
    }

    public Stack(int capacity) {

        this.capacity = capacity;
        stack = new int[capacity];
    }

    private void expand() {

        int capacity = this.capacity * 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
        this.capacity = capacity;
    }

    private void shrink() {

        int capacity = this.capacity;
        if (size() <= (capacity/4)) {
            System.out.println("Stack is less than 25% full. Shrinking...");
            capacity /= 2;
        }

        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
        this.capacity = capacity;
    }

    public void push(int data) {

        if (top >= capacity) {
            System.out.println("Stack is full. Expanding...");
            expand();
        }
        stack[top] = data;
        top++;
    }

    public int pop() {

        int data = 0;
        if (isEmpty())
            System.out.println("Cannot pop: Stack is empty.");
        else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    public void show() {

        System.out.println("Stack:");
        System.out.println("---");
        for(int n = top - 1; n >= 0; n--) {
            System.out.println(stack[n]);
            System.out.println("---");
        }
    }

    public int peek() {
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
