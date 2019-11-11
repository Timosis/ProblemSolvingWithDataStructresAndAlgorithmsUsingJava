package Dynamic_Programming;

import main.Dynamic_Programming.HouseRobber;
import main.Dynamic_Programming.UniquePaths;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicProgrammingTest {
    @Test
    public void findUniquePathsTest(){
        int row = 3;
        int col = 7;
        var result = UniquePaths.uniquePaths(3,7);
        assertEquals(28, result);
    }

    @Test
    public void robbingMaximumMoneyTest_1(){
        int[] moneysAtHouses = {2,7,9,3,1,4,8,5};

        var result =  HouseRobber.robbingHouseTest(moneysAtHouses);
        assertEquals(20,result);
    }

    @Test
    public void robbingMaximumMoneyTest_2(){
        int[] moneysAtHouses = {2,7,9,3,1};
        var result =  HouseRobber.robbingHouseTest(moneysAtHouses);
        assertEquals(12,result);
    }
}
