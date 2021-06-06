package PatternForCoding;

import main.PatternsForCoding.SlidingWindow;
import main.PatternsForCoding.TwoPointers;
import org.junit.jupiter.api.Test;

public class TwoPointersTest {
    @Test
    void removeTest() {

        int[] arr = {0,0,1,2,3,3,4,4,4,5,6};
        var result = TwoPointers.remove(arr);
    }

    @Test
    void removeWithKeyTest() {

        int[] arr = {2, 11, 2, 2, 1};
        var result = TwoPointers.removeWithKey(arr,2);
    }
}
