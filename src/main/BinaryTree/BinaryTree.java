package main.BinaryTree;

public class BinaryTree {

    public Node root;

    public BinaryTree(int[] data){
        root = buildTree(data,0);
    }

    private Node buildTree(int[] data, int i) {

        if (i >= data.length) return null;
        Node next = new Node(data[i]);
        next.left = buildTree(data, 2 * i + 1);
        next.right = buildTree(data, 2 * i + 2);
        return next;

    }

}
