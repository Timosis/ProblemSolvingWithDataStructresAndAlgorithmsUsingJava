package main.Array;

public class PivotIndex {

    /*
    * Given an array of integers nums, write a method that returns the "pivot" index of this array.
    * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
    * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
    * */
    public static int findPivotIndex(int[] numbers){

        int sumOfLeft = 0;
        int sumOfRight = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sumOfLeft += numbers[i];
            for (int j = i; j < numbers.length ; j++) {
                sumOfRight += numbers[j];
            }
            if(sumOfLeft ==  sumOfRight){
                return i;
            }
            sumOfRight = 0;
        }
        return -1;
    }

}
