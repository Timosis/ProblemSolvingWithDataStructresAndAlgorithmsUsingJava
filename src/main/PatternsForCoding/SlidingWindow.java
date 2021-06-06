package main.PatternsForCoding;

import java.util.*;


public class SlidingWindow {

    //-----------------------------------Sliding Window Technique-------------------------------------------------------

    /*
        O(N * K)
    */
    public static double[] findAverages(int K, int[] arr){
        double[] result = new double[arr.length - K + 1];
        for (int i = 0; i <= arr.length - K ; i++) {
            double sum = 0;
            for (int j = i; j < i + K ; j++) {
                sum += arr[j];
            }
            result[i] = sum / K;
        }
        return result;
    }

    /*
        O(N) - Sliding Window Approach
    */
    public static double[] findAverages_2(int K, int[] arr){
        double[] result = new double[arr.length - K + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length ; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
            // slide the window, we don't need to slide if we've not hit the required window size of 'k'
            if (windowEnd >= K - 1){
                result[windowStart] = windowSum / K; // calculate the average
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        return  result;
    }

    //----------------------------------------------Question 1----------------------------------------------------------

    /*
        Maximum Sum Subarray of Size K (easy)
        Given an array of positive numbers and a positive number 'k', find the maximum sum of any contiguous subarray of size 'k'
     */

    // Time Complexity O(N)
    public static int findMaxSumSubArray(int k, int[] arr) {
        int max = 0;
        int windowStart = 0;
        int windowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length ; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1){
                max = Math.max(max,windowSum);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        return max;
    }

    // Time Complexity O(N * K)
    public static int findMaxSumSubArray_2(int k, int[] arr) {
        int max = 0;
        int windowSum;

        for (int i = 0; i <= arr.length - k; i++) {
            windowSum = 0;
            for (int j = i; j < i + k ; j++) {
                windowSum += arr[j];

            }
            max = Math.max(max,windowSum);
        }
        
        return max;
    }

    //------------------------------------------------Question 2--------------------------------------------------------

    /*
       Given an array of positive numbers and a positive number 'S' find the smallest contiguous
       subarray whose sum is greater than or equal to 'S'. Return 0 if no such subarray exits.
     */

    public static int findMinSubArray(int S, int[] arr) {
       int windowSum = 0;
       int minLength = Integer.MAX_VALUE;
       int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length ; windowEnd++) {
            windowSum += arr[windowEnd];
            while (windowSum >= S){
                minLength = Math.min(minLength,windowEnd - windowStart + 1); // windowEnd - windowStart + 1 = length
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }



    //-------------------------------------------------Question 3------------------------------------------------------

    /*
    Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
    Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

    The order of output does not matter.

     Example 1:

    Input:
    s: "cbaebabacd" p: "abc"

    Output:
            [0, 6]

    Explanation:
    The substring with start index = 0 is "cba", which is an anagram of "abc".
    The substring with start index = 6 is "bac", which is an anagram of "abc".
    Example 2:

    Input:
    s: "abab" p: "ab"

    Output:
            [0, 1, 2]

    Explanation:
    The substring with start index = 0 is "ab", which is an anagram of "ab".
    The substring with start index = 1 is "ba", which is an anagram of "ab".
    The substring with start index = 2 is "ab", which is an anagram of "ab"*/

    public static List<Integer> findAnagrams(String s, String p) {
       int[] sCharCount = new int[26];
       int[] pCharCount = new int[26];

        for (int i = 0; i < p.length() ; i++) {
            pCharCount[p.charAt(i) - 'a']++;
        }

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i <s.length() ; i++) {
            sCharCount[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                sCharCount[s.charAt(i - p.length()) - 'a']--;
            }
            if (i >= p.length() - 1) {
                boolean anagram = true;

                for (int j = 0; j < 26 ; j++) {
                    if (sCharCount[j] != pCharCount[j]) {
                        anagram = false;
                        break;
                    }
                }
                if (anagram) {
                    result.add(i - p.length() + 1);
                }
            }
        }

        return result;
    }

    //-------------------------------------------------Question 4------------------------------------------------------

    /*Given a string, find the length of the longest substring in it with no more than K distinct characters.*/

    public static int findLength(String str, int k) {
      int max = 0;
      int windowStart = 0;
      Map<Character,Integer> map = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            map.put(str.charAt(windowEnd), map.getOrDefault(str.charAt(windowEnd),0) + 1);
            while (map.size() > k){
                map.put(str.charAt(windowStart), map.get(str.charAt(windowStart)) - 1);
                if (map.get(str.charAt(windowStart)) == 0) {
                    map.remove(str.charAt(windowStart));
                }
                windowStart++;
            }

            max = Math.max(max, windowEnd - windowStart + 1);
        }
        return max;
    }


    //-------------------------------------------------Question 5------------------------------------------------------

    //    Given a string s, find the length of the longest substring without repeating characters.
    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int windowStart = 0;
        int windowEnd = 0;

        Set<Character> set = new HashSet<>();
        while (windowEnd < s.length()) {
            if (!set.contains(s.charAt(windowEnd))) {
                set.add(s.charAt(windowEnd));
                max = Math.max(max, set.size());
                windowEnd++;
            }else{
                set.remove(s.charAt(windowStart));
                windowStart++;
            }

        }
       return max;
    }

    public static int lengthOfLongestSubstringSecond(String s) {
        int[] index = new int[128];
        int result = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < s.length (); windowEnd++) {
            char c = s.charAt(windowEnd);

            windowStart = Math.max(windowStart, index[c]);
            result = Math.max(result, windowEnd - windowStart + 1);
            index[c] = windowEnd + 1;
        }

        return result;
    }

    public int lengthOfLongestSubstringThird(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return (s.length() == 0) ? 0 : max;
    }

    //-------------------------------------------------Question 6------------------------------------------------------

    // Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s.
    // If there isn't one, return 0 instead.
    /*    Example:

          Input: s = 7, nums = [2,3,1,2,4,3]
          Output: 2
          Explanation: the subarray [4,3] has the minimal length under the problem constraint.
    */

    public int minSubArrayLen(int s, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < nums.length ; windowEnd++) {
            windowSum += nums[windowEnd];
            while (windowSum >= s) {
                minLength = Math.min(minLength,  windowEnd - windowStart + 1);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return minLength;
    }

    //-------------------------------------------------Question 7------------------------------------------------------

    /*
         Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ letters with any letter,
         find the length of the longest substring having the same letters after replacement.

       Input:
       s = "ABAB", k = 2

       Output:
       4

       Explanation:
       Replace the two 'A's with two 'B's or vice versa.

        Input:
        s = "AABABBA", k = 1

        Output:
        4

        Explanation:
        Replace the one 'A' in the middle with 'B' and form "AABBBBA".
        The substring "BBBB" has the longest repeating letters, which is 4.

    */

      public static int characterReplacement(String s, int k) {

           int[] count = new int[26];
           int windowStart = 0, maxCount = 0, maxLength = 0;
           for (int windowEnd = 0; windowEnd < s.length() ; windowEnd++) {
               maxCount = Math.max(maxCount, ++count[s.charAt(windowEnd) - 'A']);
               while (windowEnd - windowStart + 1 - maxCount > k){
                   count[s.charAt(windowStart) - 'A']--;
                   windowStart++;
               }
               maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
           }
            return maxLength;
       }


    //-------------------------------------------------Question 8------------------------------------------------------

    /*
        Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

        Example 1:

        Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
        Output: 6
        Explanation: [1,1,1,0,0,1,1,1,1,1,1]
        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
        Example 2:

        Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
        Output: 10
        Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

    */

    public static int longestOnes(int[] nums, int k){
        int start = 0;
        int end = 0;
        int n  =   nums.length;
        int max = 0;
        while (end < n){
            if (nums[end] == 1) { //expand right boundry
                end++;
            }else if (nums[end] == 0 && k > 0) { //expand right boundry but decrease K(to keep track of zeroes)
                k--;
                end++;
            }else{ //case when K becomes 0
                max = Math.max(end - start,max); //try to update the answer
                if (nums[start] == 0) {  //if left boundry had a zero then increase the K, so we can later use it
                    k++;
                }
                start++;
            }
        }
        return Math.max(max,end-start);
    }

    //-------------------------------------------------Question 9------------------------------------------------------

/*
    Given a string s and an integer k.
    Return the maximum number of vowel letters in any substring of s with length k.

    Vowel letters in English are (a, e, i, o, u).

    Example 1:

    Input: s = "abciiidef", k = 3
    Output: 3
    Explanation: The substring "iii" contains 3 vowel letters.
    Example 2:

    Input: s = "aeiou", k = 2
    Output: 2
    Explanation: Any substring of length 2 contains 2 vowels.
    Example 3:

    Input: s = "leetcode", k = 3
    Output: 2
    Explanation: "lee", "eet" and "ode" contain 2 vowels.
    Example 4:

    Input: s = "rhythms", k = 4
    Output: 0
    Explanation: We can see that s doesn't have any vowel letters.
    Example 5:

    Input: s = "tryhard", k = 4
    Output: 1
    */

    public static int maxVowels(String s, int k) {
       char[] arr = s.toCharArray();
       int start = 0;
       int max = 0;
       int windowCount = 0;

        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == 'a' || arr[end] == 'e' || arr[end] == 'i'|| arr[end] == 'o' || arr[end] == 'u') {
                windowCount++;
            }
            if (end >= k - 1) {
                max = Math.max(windowCount,max);
                if (arr[start] == 'a' || arr[start] == 'e' || arr[start] == 'i'|| arr[start] == 'o' || arr[start] == 'u') {
                    windowCount--;
                }
                start++;
            }
        }

        return max;
    }



}
