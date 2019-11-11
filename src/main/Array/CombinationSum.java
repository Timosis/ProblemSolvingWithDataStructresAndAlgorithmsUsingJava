package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
*  Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
*  Each number in candidates may only be used once in the combination.
*
*  Note:
*  All numbers (including target) will be positive integers.
*  The solution set must not contain duplicate combinations.
*
*
*  Example 1:
*  Input: candidates = [10,1,2,7,6,1,5], target = 8,
*   A solution set is:
*   [
*   [1, 7],
*   [1, 2, 5],
*   [2, 6],
*   [1, 1, 6]
*   ]
*
* Example 2:
* Input: candidates = [2,5,2,1,2], target = 5,
*   A solution set is:
*   [
*   [1,2,2],
*   [5]
*   ]
*
*
* https://leetcode.com/problems/combination-sum-ii/
*
* */
public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates,0, target, new ArrayList<Integer>(),res);
        return res;
    }

    public static void findCombination(int[] candidates, int cur, int target, List<Integer> path, List<List<Integer>> res){

        if(target == 0){
            res.add(new ArrayList(path));
            return;
        }

        if (target < 0){
            return;
        }

        for (int i = cur; i < candidates.length ; i++) {

            if (i > cur && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.add(path.size(),candidates[i]);
            findCombination(candidates,i + 1, target - candidates[i], path, res);
            path.remove(path.size() - 1);

        }
    }
}
