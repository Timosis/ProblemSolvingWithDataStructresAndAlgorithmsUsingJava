package Array;

import main.Array.BinaryGap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryGapTest {

    @Test
    public void BinaryGapTest(){

        int num = 529;

        var result = BinaryGap.longestBinaryGap(num);
        assertEquals(4,result);
    }
}
