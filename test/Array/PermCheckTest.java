package Array;

import main.Array.PermCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermCheckTest {

    @Test
    public void permCheckTest(){
        int[] arr = {4,1,3,2};
        var result = PermCheck.permCheck(arr);
        assertEquals(1,result);
    }


}
