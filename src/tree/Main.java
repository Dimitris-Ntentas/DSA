package tree;

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(4);
        tree.insert(12);
        tree.insert(19);
        tree.insert(7);
        tree.insert(2);

        tree.inOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
    }
}
