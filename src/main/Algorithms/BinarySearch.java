package main.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static int BinarySearch(List<Integer> arr, int target){
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;  //`(right - left) /2` to prevent `left + right` potential overflow
            if (arr.get(mid) == target)
                return mid;
            if (arr.get(mid) < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
