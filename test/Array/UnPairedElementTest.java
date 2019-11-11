package Array;

import main.Array.UnpairedElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnPairedElementTest {

    @Test
    public void findUnpairedElementTest(){
        int[] nums = { 9, 3, 9, 3, 9, 7, 9};
        var result = UnpairedElement.findUnpairedElement(nums);
        assertEquals(7,result);
    }

    @Test
    public void findUnpairedElementTest_2(){
        int[] nums = { 9, 3, 9, 3, 9, 7, 9};
        var result = UnpairedElement.findUnpairedElement(nums);
        assertEquals(7,result);
    }


}
