package Array;

import main.Array.CombinationSum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumTest {

    @Test
    public void CombinationSumTest_1(){
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> firstPath = new ArrayList<>();

        firstPath.add(1);
        firstPath.add(1);
        firstPath.add(6);

        List<Integer> secondPath = new ArrayList<>();

        secondPath.add(1);
        secondPath.add(2);
        secondPath.add(5);



        List<Integer> thirdPath = new ArrayList<>();
        thirdPath.add(1);
        thirdPath.add(7);

        List<Integer> fourthPath = new ArrayList<>();

        fourthPath.add(2);
        fourthPath.add(6);



        expected.add(firstPath);
        expected.add(secondPath);
        expected.add(thirdPath);
        expected.add(fourthPath);

        var result = CombinationSum.combinationSum(candidates,8);

        assertEquals(expected,result);

    }

}
