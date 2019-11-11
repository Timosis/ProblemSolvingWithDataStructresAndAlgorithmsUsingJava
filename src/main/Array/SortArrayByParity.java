package main.Array;

import java.util.*;




/*
* Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
* You may return any answer array that satisfies this condition.
* Input: [3,1,2,4]
* Output: [2,4,3,1]
* The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
*
*
* https://leetcode.com/problems/sort-array-by-parity/
*
* */
public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums){
        HashMap<String, List<Integer>> maps = new HashMap<>();
        Arrays.sort(nums);

        for(int number : nums){
            if (number % 2 == 0){
                if (!maps.containsKey("Even") ) {
                    maps.put("Even",new ArrayList<>(){{
                        add(number);
                    }});
                }
                else{
                    maps.get("Even").add(number);
                }
            }
            else{
                if (!maps.containsKey("Odd")) {
                    maps.put("Odd",new ArrayList<>(){{
                        add(number);
                    }});
                }
                else{
                    maps.get("Odd").add(number);
                }
            }
        }
        int pivot = 0;
        for (Map.Entry<String, List<Integer>> ee : maps.entrySet()) {
            String key = ee.getKey();
            List<Integer> values = ee.getValue();

            for (int i = 0; i < values.size();i++) {
                nums[pivot] = values.get(i);
                pivot++;
            }
        }
        return nums;
    }

    public static int[] sortArrayByParitySecondSolution(int[] nums){
        int index = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[index];
                nums[index++] = nums[i];
                nums[i] = temp;
            }
        }

        return nums;
    }
}
