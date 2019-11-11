package main.BinaryTree;



/*
* Given two binary trees, write a function to check if they are the same or not.
* Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
*
* Example 1:
*
*  Input:      1         1
*             / \       / \
*            2   3     2   3
*
*          [1,2,3],   [1,2,3]
*
* Output: true
*
* Example 2:
*
* Input:      1            1
*            /\           /\
*           2  null    null 2
*
*       [1,2],     [1,null,2]
*
*
* Output: false
*
*
* Example 3:
*
* Input:
*           1         1
*          / \       / \
*         2   1     1   2
*
*        [1,2,1],   [1,1,2]
*
* Output: false
*
* https://leetcode.com/problems/same-tree/
*
* */
public class SameTree {

    public static boolean isSameTree(Node p, Node q){
        if (p == null && q == null) {
            return true;
        }
        else if (p == null || q == null){
            return false;
        }else if(p.value != q.value){
            return false;
        }else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
}
