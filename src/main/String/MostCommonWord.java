package main.String;

import java.util.HashMap;

/*
* Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
* It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
* Words in the list of banned words are given in lowercase, and free of punctuation.
* Words in the paragraph are not case sensitive.  The answer is in lowercase.
*
* Input:
* paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
* banned = ["hit"]
* Output: "ball"
*
* "hit" occurs 3 times, but it is a banned word.
* "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
*
* https://leetcode.com/problems/most-common-word/
*
*/
public class MostCommonWord {

    public static String findMostCommonWord(String paragraph, String[] banned){

        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String,Integer> maps = new HashMap<>();
        for (String word : words){
            maps.put(word,maps.getOrDefault(word,0) + 1);
        }
        for(String word : banned){
            if (maps.containsKey(word)){
                maps.remove(word);
            }
        }

        String res = null;

        for (String word : maps.keySet()){
            if (res == null || maps.get(word) > maps.get(res)){
                res = word;
            }
        }

        return res;

    }
}
