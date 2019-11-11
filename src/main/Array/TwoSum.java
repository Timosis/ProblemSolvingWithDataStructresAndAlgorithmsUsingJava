package main.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
* -------Amazon Interview Question----------
* Given an int array nums and an int target,
* find how many unique pairs in the array such that their sum is equal to target. Return the number of pairs.

* Example 1:
* Input: nums = [1, 1, 2, 45, 46, 46], target = 47
* Output: 2
* Explanation:
* 1 + 46 = 47
* 2 + 45 = 47

* Example 2:
* Input: nums = [1, 1], target = 2
* Output: 1
* Explanation:
* 1 + 1 = 2

* Example 3:
* Input: nums = [1, 5, 1, 5], target = 6
* Output: 1
* Explanation:
* [1, 5] and [5, 1] are considered the same.
*
*
* */
public class TwoSum {
    public static int findPairs(int[] nums, int target){
        Set<Integer> set = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        int count = 0;
        for(int number : nums){
            if (set.contains(target - number) && !seen.contains(number)) {
                count++;
                seen.add(target - number);
                seen.add(number);
            }else if(!set.contains(number)){
                set.add(number);
            }
        }
        return count;
    }
}
