package main.BinaryTree;

import main.BinaryTree.Node;

// class of static methods for implementing our algorithms
public class BinarySearchTree {

    public Node root;

    BinarySearchTree(){
        root = null;
    }

    public void insert(int value){
        root = insert(root,value);
    }

    public Node insert(Node node,int value){

        if (node == null) {
            return new Node(value);
        }
        
        // Move to the left if passed value is
        // less than current node
        if (value < node.value){
            node.left = insert(node.left,value);
        }

        // Move to the Right if passed value is
        // less than current node
        else if(value > node.value){
            node.right = insert(node.right,value);
        }

        return node;
    }

    // Search node in binary search tree
    public Node find(int searchedValue){
        Node current = root;
        while (current.value != searchedValue){
            if (searchedValue < current.value){
                // Move to the left if searched value is less
                current = current.left;
            }
            else {
                 current = current.right;
                }

            if (current == null){
                return null;
            }
        }

        return current;
    }

    public void inOrder(Node node){
        if (node == null) {
            return ;
        }
        inOrder(node.left);
        node.displayData();
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if (node == null) {
            return;
        }
        node.displayData();
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        node.displayData();
    }
}
