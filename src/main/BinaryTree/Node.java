package main.BinaryTree;

// Represents A Node For A Tree
public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void displayData(){
        System.out.println("Value:" + value);
    }
}
