package main.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstElementNotSmallerThanTarget {


    // Given an array of integers sorted in increasing order and a target,
    // find the index of the first element in the array that is larger than or equal to the target.
    // Assume that it is guaranteed to find a satisfying number.
    public static int FindFirstBiggerElement(List<Integer> arr, int target){
        int left = 0;
        int right = arr.size() - 1;

        int boundaryIndex = -1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr.get(mid) >= target) {
                boundaryIndex = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }


}
