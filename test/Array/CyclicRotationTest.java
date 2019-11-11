package Array;

import main.Array.CyclicRotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CyclicRotationTest {

    @Test
    public void CyclicRotationTestOne(){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var result = CyclicRotation.cyclicRotationSolution(nums,3);

        int[] expected = {8, 9, 10, 1, 2, 3, 4, 5, 6, 7};

        assertArrayEquals(expected,result);

    }

    @Test
    public void CyclicRotationLeftTest(){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var result = CyclicRotation.cyclicRotationLeftSolution(nums,3);

        int[] expected = {4, 5, 6, 7, 8, 9, 10, 1, 2, 3};

        assertArrayEquals(expected,result);

    }

    @Test
    public void CyclicRotationRecursionTest(){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var result = CyclicRotation.cyclicRotationRecursion(nums,3);

        int[] expected = {8, 9, 10, 1, 2, 3, 4, 5, 6, 7};

        assertArrayEquals(expected,result);

    }





}
