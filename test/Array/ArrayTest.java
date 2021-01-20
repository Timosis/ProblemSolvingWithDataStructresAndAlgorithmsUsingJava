package Array;

import main.Array.FrogRiverOne;
import main.Array.MaximumPossibleValue;
import main.Array.PivotIndex;
import main.Array.SortArrayByParity;
import main.String.NumOfUniqueEmails;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

    @Test
    void pivotIndex() {

        int[] arr = {1, 7, 3, 6, 5, 6};
        var result = PivotIndex.findPivotIndex(arr);
        assertEquals(3, result);
    }

    @Test
    void sortArrayByParity() {
        int[] arr = {1, 7, 3, 6,2, 4,9,5,0,8};
        int[] expected = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
        var result = SortArrayByParity.sortArrayByParity(arr);
        assertArrayEquals(expected,result);
    }

    @Test
    void sortArrayByParitySecondSolution() {
        int[] arr = {1, 7, 3, 6, 2, 4, 9, 5, 0, 8};
        int[] expected = {6, 2, 4, 0, 8, 3, 9, 5, 1, 7};
        var result = SortArrayByParity.sortArrayByParitySecondSolution(arr);
        assertArrayEquals(expected,result);
    }

    @Test
    void frogRiverSolution() {
        int[] arr = {1,3,1,4,2,3,5,4};
        var result = FrogRiverOne.frogRiverOne(5,arr);
        assertEquals(6,result);
    }

    @Test
    void MaximumPossibleValueTest(){
        int num = -661;
        var result = MaximumPossibleValue.MaximumPossibleValue(num);
        assertEquals(-5661,result);
    }

}
