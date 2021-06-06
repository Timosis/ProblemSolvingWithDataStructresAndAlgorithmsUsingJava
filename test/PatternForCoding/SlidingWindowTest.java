package PatternForCoding;

import main.PatternsForCoding.SlidingWindow;
import org.junit.jupiter.api.Test;

public class SlidingWindowTest {
    @Test
    void findAverages() {

        int[] arr = {1,2,3,4,5,1,2,3,9,10,11};
        var result = SlidingWindow.findAverages(5,arr);
    }

    @Test
    void findAnagramsTest() {

        String s = "cbaebabacd";
        String p = "abc";
        var result = SlidingWindow.findAnagrams(s,p);
    }

    @Test
    void findLengthTest() {

        String s = "cbbebi";
        int k = 3;
        var result = SlidingWindow.findLength(s,k);
    }

    @Test
    void lengthOfLongestSubstringTest() {

        String s = "pwwkew";
        var result = SlidingWindow.lengthOfLongestSubstringSecond(s);
    }
    @Test
    void characterReplacementTest() {

        String s = "AABABBA";
        var result = SlidingWindow.characterReplacement(s,1);
    }

    @Test
    void longestOnesTest() {

        int[] num = {1,1,1,0,0,0,1,1,1,1,0};
        var result = SlidingWindow.longestOnes(num,2);
    }

    @Test
    void maxVowelTest() {

        String s = "abciiidef";
        var result = SlidingWindow.maxVowels(s,3);
    }


}
