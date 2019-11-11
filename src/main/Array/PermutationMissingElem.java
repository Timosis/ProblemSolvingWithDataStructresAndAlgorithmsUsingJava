package main.Array;

import java.util.Arrays;

/*
* An array A consisting of N different integers is given.
* The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
*
* Your goal is to find that missing element.
*
* Write a function:
*
* class Solution { public int solution(int[] A); }
*
* that, given an array A, returns the value of the missing element.
*
* For example, given array A such that:
*
*   A[0] = 2
*   A[1] = 3
*   A[2] = 1
*   A[3] = 5
* the function should return 4, as it is the missing element.
*
* Write an efficient algorithm for the following assumptions:
*
* N is an integer within the range [0..100,000];
* the elements of A are all distinct;
* each element of array A is an integer within the range [1..(N + 1)].
*
* */
public class PermutationMissingElem {

    public static int findMissingElement(int[] arr){

        if (arr.length == 0 || arr == null || arr.length == 1) {
            return 0;
        }

        Arrays.sort(arr);

        for (int i = 0; i <arr.length - 1 ; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return arr[i] + 1;
            }
        }

        return -1;
    }


    public static int findMissingElementSecondSolution (int[] arr){
        long len = arr.length + 1;

        long total = (len * (len + 1))/2;

        for(int num : arr){
            total -= num;
        }

        return  (int)total;
    }


}
