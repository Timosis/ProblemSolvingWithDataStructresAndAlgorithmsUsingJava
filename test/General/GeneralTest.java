package General;

import main.General.HappyNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneralTest {

    @Test
    public void isHappyNumberTest(){
        int number = 54;
        var result = HappyNumber.isHappyNumber(number);

        assertTrue(result);
    }


}
