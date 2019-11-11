package main.BinaryTree;

/*
*
* Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
* Note: A leaf is a node with no children.
* Example:
* Given the below binary tree and sum = 22,
*
*       5
*      / \
*     4   8
*    /   / \
*   11  13  4
*  /  \    / \
* 7    2  5   1
*
* Return:
* [
*  [5,4,11,2],
*   [5,8,4,5]
* ]
*
*
*/

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    public static List<List<Integer>> findPathSum(Node root,int sum){
        List<List<Integer>> res = new ArrayList<>();
        findPaths(root, sum, new ArrayList<>(),res);

        return res;
    }

    private static void findPaths(Node node, int sum,List<Integer> path,List<List<Integer>> res) {

        if (node == null) {
            return;
        }

        path.add(node.value);
        if (node.value == sum && node.left == null && node.right ==  null) {
            res.add(new ArrayList<>(path));
            return;
        }else{
            findPaths(node.left,sum-node.value,path,res);
            findPaths(node.right,sum-node.value,path,res);
        }

        path.remove(path.size() - 1);

    }


}
