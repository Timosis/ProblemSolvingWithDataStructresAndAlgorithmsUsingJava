package Array;

import main.Array.MaxCounters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxCountersTest {


    @Test
    public void maxCountersTest(){
        int[] arr = {3, 4, 4, 6, 1, 4, 4};
        int[] expected = {3, 2, 2, 4, 2};

        var result = MaxCounters.maxCounters(5, arr);

        assertArrayEquals(expected,result);
    }


}
