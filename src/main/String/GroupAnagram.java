package main.String;

import java.util.*;

/*
* Given an array of strings, group anagrams together.
*
* Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
* Output:
* [
* ["ate","eat","tea"],
* ["nat","tan"],
* ["bat"]
* ]
*
* https://leetcode.com/problems/group-anagrams/
*
* */
public class GroupAnagram {

    //First Solution
    public static List<List<String>> listGroupAnagram(String[] strs){
        List<List<String>> groupAnagram = new ArrayList<>();
        HashMap<String,List<String>> maps = new HashMap<>();

        for(String current : strs){
            char[] forSortingCurrent = current.toCharArray();
            Arrays.sort(forSortingCurrent);
            String sorted = new String(forSortingCurrent);
            if (!maps.containsKey(sorted)) {
                maps.put(sorted,new ArrayList<>(){{
                    add(current);
                }});
            }else{
                maps.get(sorted).add(current);
            }
        }
        groupAnagram.addAll(maps.values());
        return groupAnagram;
    }

    //Second Solution

    public static List<List<String>> groupOfAnagrams(String[] strs){
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> maps = new HashMap<>();

        for(String current : strs){
            String code = getCode(current);
            if(!maps.containsKey(code)){
                maps.put(code,new ArrayList<>(){{
                    add(current);
                }});
            }else{
                maps.get(code).add(current);
            }
        }
        result.addAll(maps.values());
        return result;
    }

    private static String getCode(String current) {
        char[] code = new char[26];
        for(char c : current.toCharArray()){
            code[c - 'a']++;
        }
        return new String(code);
    }

    public static char maximumOccurringCharacter(String text) {
        // Write your code here

        int max = 0;
        Character result = null;

        char[] textChar =  text.toCharArray();
        Map<Character,Integer> maps = new HashMap<>();

        for(char letter : textChar){
            if(maps.containsKey(letter)){
                maps.put(letter,maps.get(letter) + 1);
            }
            else{
                maps.put(letter,1);
            }
        }

        for(char letter : maps.keySet()){
            if (maps.get(letter) > max){
                max = maps.get(letter);
            }
        }

        for (char letter : maps.keySet()) {
            if (maps.get(letter).equals(max)) {
                result = letter ;
            }
        }
        return result;
    }



}
