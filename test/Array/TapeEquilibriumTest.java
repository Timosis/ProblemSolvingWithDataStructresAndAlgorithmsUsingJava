package Array;

import main.Array.TapeEquilibrium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TapeEquilibriumTest {


    @Test
    public void tapeTapeEquilibriumTest(){
        int[] arr = {3, 1, 2, 4, 3};
        var result = TapeEquilibrium.tapeEquilibrium(arr);
        assertEquals(1,result);
    }

    @Test
    public void tapeTapeEquilibriumSecondTest(){
        int[] arr = {3, 1, 2, 4, 3};
        var result = TapeEquilibrium.tapeEquilibriumAnotherSolution(arr);
        assertEquals(1,result);
    }


}
