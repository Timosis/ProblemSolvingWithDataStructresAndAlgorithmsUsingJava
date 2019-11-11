package main.Array;

/*
* A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
* Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
* The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
* In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
*
* For example, consider array A such that:
*
*   A[0] = 3
*   A[1] = 1
*   A[2] = 2
*   A[3] = 4
*   A[4] = 3
*
* We can split this tape in four places:
*
* P = 1, difference = |3 − 10| = 7
* P = 2, difference = |4 − 9| = 5
* P = 3, difference = |6 − 7| = 1
* P = 4, difference = |10 − 3| = 7
*
* Write a function:
*
* class Solution { public int solution(int[] A); }
*
* that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
* For example, given:
*
*   A[0] = 3
*   A[1] = 1
*   A[2] = 2
*   A[3] = 4
*   A[4] = 3
*
* the function should return 1, as explained above.
* Write an efficient algorithm for the following assumptions:
*
* N is an integer within the range [2..100,000];
* each element of array A is an integer within the range [−1,000..1,000].
*
* */
public class TapeEquilibrium {

    public static int tapeEquilibrium(int[] arr){

        int min = Integer.MAX_VALUE;
        int leftTotal = 0;
        int rightTotal = 0;

        for (int i = 0; i <= arr.length - 2 ; i++) {
            leftTotal += arr[i];

            for (int j = i + 1; j <= arr.length - 1 ; j++) {
                rightTotal += arr[j];
            }

            if (Math.abs(leftTotal - rightTotal) < min) {
                min = Math.abs(leftTotal - rightTotal);
            }

            rightTotal = 0;
        }

        return min;
    }

    public static int tapeEquilibriumAnotherSolution(int[] arr){
        int min = Integer.MAX_VALUE;

        int[] sumArray = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {

            if (i > 0) {
                sumArray[i] = sumArray[i - 1] + arr[i];
            }else{
                sumArray[i] = arr[i];
            }
        }

        for (int i = 0; i < sumArray.length - 1; i++) {
            int rightTotal = sumArray[sumArray.length - 1] - sumArray[i];
            int dif = Math.abs(sumArray[i] - rightTotal);

            if (dif < min) {
                min = dif;
            }
        }

        return min;
    }




}
