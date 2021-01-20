package Array;

import main.Array.OddOccurrencesInArray;
import main.Array.PivotIndex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOccurrencesInArrayTest {

    @Test
    void Test_1() {

        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        var result = OddOccurrencesInArray.oddOccurrencesInArraySolution(arr);
        assertEquals(7, result);
    }

}
