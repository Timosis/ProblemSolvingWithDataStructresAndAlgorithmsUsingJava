package BinaryTree;

import main.BinaryTree.BinaryTree;
import main.BinaryTree.Node;
import main.BinaryTree.PathSum;
import main.BinaryTree.SameTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BinaryTreeTest {

    @Test
    public void pathSumTest(){
        int[] data = { 5, 4, 8, 11, 13, 4, 7, 2, 5, 1 };
        BinaryTree builder = new BinaryTree(data);
        Node tree = builder.root;

        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> first_path = new ArrayList<>();
        first_path.add(5);
        first_path.add(4);
        first_path.add(11);
        first_path.add(2);

        paths.add(first_path);

        var result = PathSum.findPathSum(tree,22);

        assertEquals(paths, result);
    }

    @Test
    public void isSameTreeTest(){
        int[] data = {1,2,3,4,5,6,7};
        BinaryTree  firstbuilder = new BinaryTree(data);
        BinaryTree secondBuilder = new BinaryTree(data);

        Node firstTree = firstbuilder.root;
        Node secondTree = secondBuilder.root;

        var result = SameTree.isSameTree(firstTree,secondTree);
        assertEquals(true,result);
    }

    @Test
    public void isSameTreeTest_2(){
        int[] firstData = {1,2,3,4,5,6,7};
        int[] secondData = {5,3,2,4,5,8,7};
        BinaryTree  firstbuilder = new BinaryTree(firstData);
        BinaryTree secondBuilder = new BinaryTree(secondData);

        Node firstTree = firstbuilder.root;
        Node secondTree = secondBuilder.root;

        var result = SameTree.isSameTree(firstTree,secondTree);
        assertNotEquals(true,result);
    }



}
