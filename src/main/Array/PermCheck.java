package main.Array;

import java.util.HashSet;

/*
*
* A non-empty array A consisting of N integers is given.
* A permutation is a sequence containing each element from 1 to N once, and only once.
* For example, array A such that:
*
*     A[0] = 4
*     A[1] = 1
*     A[2] = 3
*     A[3] = 2
* is a permutation, but array A such that:
*
*     A[0] = 4
*     A[1] = 1
*     A[2] = 3
*
* is not a permutation, because value 2 is missing.
* The goal is to check whether array A is a permutation.
*
* Write a function:
* class Solution { public int solution(int[] A); }
*
* that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
*
* Write an efficient algorithm for the following assumptions:
* N is an integer within the range [1..100,000];
* each element of array A is an integer within the range [1..1,000,000,000].
*
* */
public class PermCheck {
    public static int permCheck(int[] arr){
        int len = arr.length;
        int total = (len * (len + 1)) / 2 ;
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }

        if (set.size() != arr.length) {
            return 0;
        }

        for (int num : arr){
            total -=  num;

        }

        if (total == 0) {
            return 1;
        }
        return 0;
    }
}
