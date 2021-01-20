package main.Array;

/*
* An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
* and the last element of the array is moved to the first place.
*  For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
* The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
* Write a function:
*
*   class Solution { public int[] solution(int[] A, int K); }
*
* that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
*
* For example, given
*
*    A = [3, 8, 9, 7, 6]
*    K = 3
* the function should return [9, 7, 6, 3, 8]. Three rotations were made:
*
*    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
*    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
*    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
*
*  For another example, given
*
*    A = [0, 0, 0]
*    K = 1
* the function should return [0, 0, 0]
*
* Given
*
*    A = [1, 2, 3, 4]
*    K = 4
* the function should return [1, 2, 3, 4]
*
* Assume that:
*
* N and K are integers within the range [0..100];
* each element of array A is an integer within the range [−1,000..1,000].
* In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
*
* */
public class CyclicRotation {

    public static int[] cyclicRotationSolution(int[] nums, int k){

        if(k > nums.length){
            k = k % nums.length;
        }

        for (int i = 0; i < k ; i++) {

            int temp = nums[nums.length - 1];

            for (int j = nums.length - 1; j > 0 ; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = temp;
        }
        return nums;
    }

    public static  int[] cyclicRotationLeftSolution(int[] nums, int k){
        if (k > nums.length) {
            k = k % nums.length;
        }

        for (int i = 0; i < k ; i++) {
            int temp = nums[0];

            for (int j = 0; j < nums.length - 1 ; j++) {
                nums[j] = nums[j + 1];
            }

            nums[nums.length - 1] = temp;
        }

        return nums;
    }

    public static  int[] cyclicRotationRecursion(int[] nums, int k){

        if (nums.length == 0 || nums == null || k < 0 ) {
            throw new IllegalArgumentException("IllegalArgument");
        }

        if (k > nums.length) {
            k = k % nums.length;
        }


        int sub = nums.length - k;

        rotate(nums, 0, sub - 1);
        rotate(nums, sub, nums.length - 1);
        rotate(nums, 0, nums.length - 1);

        return nums;
    }

    private static void rotate(int[] nums, int start, int end) {

        while (start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
