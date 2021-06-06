package main.PatternsForCoding;

import main.LinkedList.Single.LinkedList;
import main.LinkedList.Single.Node;

import java.util.HashMap;
import java.util.Map;

public class TwoPointers {

//-------------------------------------------------------Question 1----------------------------------------------------


/*    Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
      Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
*/

    // [1,9]

    public static int[] search(int[] arr, int targetSum){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int currentSum = arr[start] + arr[end];
            if (currentSum == targetSum) {
                return new int[]{start, end};
            }
            if (targetSum > currentSum) {
                start++;
            }else{
                end++;
            }
        }
        return new int[]{-1, -1};
    }


    public static int[] searchWithHashMap(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[]{map.get(target - arr[i]),i};
            }else{
                map.put(arr[i],i);
            }
        }

        return new int[]{-1, -1};
    }


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

//-----------------------------------------------Question 2------------------------------------------------------------

  /*
     Given an array of sorted numbers, remove all duplicates from it.
     You should not use any extra space; after removing the duplicates in-place return the new length of the array.

     Input: [2, 3, 3, 3, 6, 9, 9]
     Output: 4
     Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].

     Input: [2, 2, 2, 11]
     Output: 2
     Explanation: The first two elements after removing the duplicates will be [2, 11].

    */

    public static int remove(int[] arr){
      int nextNonDublicate = 1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[nextNonDublicate - 1] != arr[i]) {
                arr[nextNonDublicate] = arr[i];
                nextNonDublicate++;
            }
        }
        return nextNonDublicate;
    }

    //--------------------------------------------------Question 2----------------------------------------------------

    /*
        Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array.

        Input: [3, 2, 3, 6, 3, 10, 9, 3], Key=3
        Output: 4
        Explanation: The first four elements after removing every 'Key' will be [2, 6, 10, 9].

        Input: [2, 11, 2, 2, 1], Key=2
        Output: 2
        Explanation: The first two elements after removing every 'Key' will be [11, 1].

    */

    public static int removeWithKey(int[] arr, int key){
        int nextElement = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != key){
                arr[nextElement] = arr[i];
                nextElement++;
            }
        }
        return nextElement;
    }


    //---------------------------------------------------Question 3----------------------------------------------------

    /*
        Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.
    */
    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast =  fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return false;
            }
        }
        return false;
    }

    //------------------------------------------------------Question 4-------------------------------------------------

    /*
        Given the head of a LinkedList with a cycle, find the length of the cycle.
    */

    /*
        Solution: We can use the above solution to find the cycle in the LinkedList.
        Once the fast and slow pointers meet, we can save the slow pointer and iterate the whole cycle
        with another pointer until we see the slow pointer again to find the length of the cycle.
    */


    public static int findCycleLength(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast =  fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return calculateLength(slow);
            }
        }
        return 0;
    }

    private static int calculateLength(Node slow) {
        Node current = slow;
        int cyclength = 0;
        do {
            current = current.next;
            cyclength++;

        }while (current != slow);
         return cyclength;
    }


    //------------------------------------------------------Question 5-------------------------------------------------

    /*
          Given the head of a Singly LinkedList that contains a cycle, write a function to find the starting node of the cycle.
    */

    public static Node findStartingNode(Node head){
        int cycleLength = 0;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                cycleLength = calculateListCycleLength(slow);
                break;
            }
        }

        return findStart(head,cycleLength);

    }


    public static int calculateListCycleLength(Node slow){
        int listLength = 0;
        Node current = slow;
        do {
            listLength++;
            current = current.next;
        }while(current != slow);

        return listLength;
    }

    private static Node findStart(Node head, int cycleLength){
        Node pointer1 = head;
        Node pointer2 = head;

        while(cycleLength > 0){
            pointer2 = pointer2.next;
            cycleLength--;
        }

       while(pointer1 != pointer2){
           pointer1 = pointer1.next;
           pointer2 = pointer2.next;
       }

       return pointer1;
    }




}
