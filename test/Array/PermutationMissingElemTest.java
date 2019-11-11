package Array;

import main.Array.PermutationMissingElem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationMissingElemTest {

    @Test
    public void permutationMissingElemTest(){

        int[] arr = {5,2,7,3,6,1,9,8};

        var result = PermutationMissingElem.findMissingElement(arr);

        assertEquals(4, result);
    }

    @Test
    public void permutationMissingElemSecondSolutionTest(){

        int[] arr = {5,2,7,3,6,1,9,8};

        var result = PermutationMissingElem.findMissingElementSecondSolution(arr);

        assertEquals(4, result);
    }


}
