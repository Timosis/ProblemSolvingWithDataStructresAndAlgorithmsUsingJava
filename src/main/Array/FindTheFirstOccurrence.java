package main.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheFirstOccurrence {
    public static int Solution(List<Integer> arr, int target){
        int left = 0;
        int right = arr.size() - 1;
        int targetIndex = -1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;

            if (arr.get(mid)  == target) {
                targetIndex = mid;
                right = mid - 1;
            }else if (arr.get(mid) < target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return targetIndex;
    }
}
