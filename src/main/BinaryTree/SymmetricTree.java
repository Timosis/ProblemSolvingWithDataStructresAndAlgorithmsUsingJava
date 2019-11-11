package main.BinaryTree;


/*
*
* Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
* For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
*
*
*              1
*             / \
*            2   2
*           / \ / \
*          3  4 4  3
*
*  But the following [1,2,2,null,3,null,3] is not:
*
*              1
*             / \
*            2   2
*            \   \
*            3    3
*
*
*  https://leetcode.com/problems/symmetric-tree/
*
* */
public class SymmetricTree {

    public static boolean isSymetric(Node node){
        if(node == null){
            return true;
        }

      return isSymteric(node.left,node.right);
    }

    public static boolean isSymteric(Node left, Node right){
        if (left  == null || right == null) {
            return left==right;
        }

        if (left.value != right.value) {
            return false;
        }

        return isSymteric(left.left,right.right) && isSymteric(left.right,right.left);
    }
}
