package main;

import main.BinaryTree.BinarySearchTree;
import main.BinaryTree.Node;
import main.String.MostCommonWord;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 0},
                {0, 0, 1},
                {1, 1, 0}
        };

        int[] arr = {20, 10, 20, 10, 17};
        //minimumPossibleTotalCost(arr);
        //ReplaceIp("1.1.1.1.1");
        //numJewelsInStones("aAB", "aAbbaBBaAA");

        //System.out.println(firstUniqueCharacter("loveleetcode"));
        //System.out.println(firstUniqueCharacter("leetCode"));

        //int[] arrForFindSingleNumber = {20, 10, 20, 10, 17};
        //System.out.println(findSingleNumber(arrForFindSingleNumber));

        //System.out.println(isNumberPowerOfTwo(4));
        //System.out.println(judgeCircle("LL"));

        int[] missingNumberArr = {9, 0, 5, 2, 1, 4, 6, 7, 8};
        //System.out.println(missingNumber(missingNumberArr));
        //System.out.println(missingNumberAnotherSolution(missingNumberArr));
       // BinarySearchTree();
        int[] removeElementArr = {3,2,2,3};
        //System.out.println(removeElement(removeElementArr,3));
        int[] unpairedElementArr = {9, 3, 9, 3, 9, 7, 9};
        //System.out.println(binaryGap(1041));
        //System.out.println(unpairedElement(unpairedElementArr));
        //System.out.println(singleNumber(unpairedElementArr));
        int[] binarySearchTreeArr = {3,5,1,6,2,0,8,7,4};
        //BinarySearchTree tree = CreateBinarySearchTree(binarySearchTreeArr);


        Node p = new Node(6);
        Node q = new Node(7);

        //System.out.println(lowestCommonAncestorBinaryTree(tree.root, p, q));

        int[] heights = {1,8,6,2,5,4,8,3,7};
        int[][] pixels = {
                {1, 0, 1, 0, 0, 0},
                {1, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 0},
                {1, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 0},
        };
       // floodFill(pixels,3,2,2);
       /* for (int i = 0; i <pixels.length ; i++) {
            for (int j = 0; j <pixels[0].length ; j++) {
                System.out.print(pixels[i][j] + " ");
            }
            System.out.println();
        }*/
        //System.out.println(maxArea(heights));
        //System.out.println(removeElement(missingNumberArr));

        int[] numberOfOccurrences =  {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        //System.out.println(uniqueOccurrences(numberOfOccurrences));

   /*     SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.printList();

        list.reverse();
        System.out.println("Reversed Linked List");
        list.printList();*/

        String paragraph =  "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(MostCommonWord.findMostCommonWord(paragraph,banned));



    }

    public static void ReplaceIp(String str) {

        StringBuilder newAdress = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                newAdress.append("[.]");
            }
            if (str.charAt(i) != '.') {
                newAdress.append(str.charAt(i));
            }
        }

        System.out.println(newAdress);
    }

    public static void NumJewelsInStones(String Jewels, String Stones) {

        int numOfJewelsInStones = 0;

        Set<Character> set = new HashSet<>();

        for (char j : Jewels.toCharArray()) {
            set.add(j);
        }

        for (char s: Stones.toCharArray()) {
            if (set.contains(s)){
                numOfJewelsInStones++;
            }
        }

        System.out.println(numOfJewelsInStones);
    }

    public static void minimumPossibleTotalCost(int[] arr){

        int[] dp = new int[arr.length];


        if (arr.length == 1) {
            dp[0] = 0; // If there is a single stone so frog can't jump anywhere.There won't be any energy cost.
        }
        if (arr.length >= 2) {
            dp[1] = Math.abs(arr[0] - arr[1]); // If there are more than two stones
        }

        for (int i = 2; i <arr.length ; i++) {
            dp[i] = Math.min(dp[i-1] + Math.abs(arr[i] - arr[i - 1]),dp[i - 2] + Math.abs(arr[i - 2] - arr[i]));
        }

        System.out.println(dp[dp.length - 1]);
    }

    /* The get(key) method at HashMap is used to return the value to which the specified key is mapped,
     * or null if this map contains no mapping for the key.
     *
     * key − This is the key whose associated value is to be returned
     *
     * HashMap newmap = new HashMap();
     * newmap.put(1, "tutorials");
     * newmap.put(2, "point");
     * newmap.put(3, "is best");
     *
     * String val = (String)newmap.get(3);
     * System.out.println("Value for key 3 is: " + val);
     *
     * Question : Given a string, find the first non-repeating character in it and return it's index. If doesn't exit return -1
     */
    public static int firstUniqueCharacter(String str){
        HashMap<Character,Integer> characterBoard = new HashMap<Character, Integer>();
        for (int i = 0; i <str.length() ; i++) {
                char c = str.charAt(i);
            if (characterBoard.containsKey(c)){
                characterBoard.put(c,characterBoard.get(c) + 1);
            }
            else{
                characterBoard.put(c , 1);
            }
        }
        for(int key:characterBoard.keySet()){

        }

        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if (characterBoard.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }

    /* Given a non-empty array of integers, every element appears twice except for one. Find that single one.*/
    public static int findSingleNumber(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i <arr.length ; i++) {

            if (set.contains(arr[i])){
                set.remove(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }

        for (int item: set) {
            return item;
        }
        return -1;
    }

    /* Given an integer, write a function to determine if it is a power of two.
     */
    public static boolean isNumberPowerOfTwo(int number){
       long i = 1;
       while (i < number){
           i *= 2;
       }
       return i == number;
    }

    /* There is a robot starting at position (0,0), the origin, on a 2D plane. Given a sequence of its moves,
     * judge if this root ends up at (0,0) after it completes its moves.
     * The move sequence represented by a string, and character move[i] represents its move.
     * Valid moves are R(Right), L(Left), U(Up), D(Down).
     * If the robots returns to be origin after it finishes all of its moves, return true.Otherwise, return false.
     */
    public static boolean judgeCircle(String move){
        int[] location = new int[2];
        for (int i = 0; i <move.length() ; i++) {
            switch (move.charAt(i)){
                case 'R':
                    location[0] += 1;
                    break;
                case 'L':
                    location[0] -= 1;
                    break;
                case 'U':
                    location[1] += 1;
                    break;
                case 'D':
                    location[1] -= 1;
                default:
                    break;
            }
        }

        if (location[0] == 0 && location[1] == 0 ){
                return true;
        }
        return false;
    }

    /*Given an array containing n distinct numbers taken from 0,1,2,3,......,n.
    * Find the one that is missing from the array.
    */
    public static int missingNumber(int[] arr){
        HashSet<Integer> numberSet = new HashSet<>();
        for (var number : arr) {
            numberSet.add(number);
        }

        for (int i = 0; i <arr.length + 1 ; i++) {
            if (!numberSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumberAnotherSolution(int[] arr){
        int sum = 0;
        for (var number: arr) {
            sum += number;
        }

        int n = arr.length + 1; // last element of array without missing number

        return (n*(n-1))/2 - sum;
    }

/*
    public static BinarySearchTree CreateBinarySearchTree(int[] arr){
        BinarySearchTree tree = new BinarySearchTree();
        for (int num : arr) {
            tree.insert(num);
        }

        return tree;

        */
/*System.out.println("Inorder traversal :");
        tree.inOrder(tree.root);
        System.out.println();
        Node node = tree.find(15);
        System.out.println((node == null) ? "Not found" : String.valueOf(node.value));
        System.out.println("Preorder traversal");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("Post traverseal:");
        tree.postOrder(tree.root);
        System.out.println();*//*

    }
*/

 /*   public static boolean hasPathSum(Node node, int sum){
       if(node == null){
           return false;
       }else if(node.left == null && node.right == null && sum - node.value == 0){
           return true;
       }
       else{
           return hasPathSum(node.left,sum-node.value) || hasPathSum(node.right, sum-node.value);
       }
    }*/

    public static int removeElement(int[] arr, int val){
        if(arr.length == 0 || val == 0){
            return -1;
        }
        int m = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] != val){
                arr[m] = arr[i];
                m++;
            }
        }

        return m;
    }

    public static int binaryGap(int N) {
        int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < 32; ++i){
            if (((N >> i) & 1) != 0)
                A[t++] = i;
        }
        int ans = 0;
        for (int i = 0; i < t - 1; ++i)
            ans = Math.max(ans, A[i+1] - A[i]);
        return ans;
    }

    public static int unpairedElement(int[] A) {
        int unpairedCount = 0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0  ; i < A.length; i++){
            int num =  A[i];

            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            }else{
                map.put(num,1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) % 2 == 1){
                unpairedCount++;
            }
        }
        return unpairedCount;
    }

    /*
    * Find a single number which is no paired in array
    * */
    public static int singleNumber(int[] nums) {
        /**
         // Runtime: O(n)
         // Space: O(n)
         HashSet<Integer> set = new HashSet<Integer>();
         for (int i = 0; i < nums.length; i++) {
         if (set.contains(nums[i])) {
         set.remove(nums[i]);
         } else {
         set.add(nums[i]);
         }

         }
         Iterator<Integer> it = set.iterator();
         return it.next();
         */
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        return a;
    }


    /*
    * Given a binary SEARCH tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
    * According to the definition of LCA on Wikipedia:
    *  “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants
    * (where we allow a node to be a descendant of itself).”
    * Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
    *
    *
    * */
/*
    public static Node lowestCommonAncestor(Node root, Node p, Node q){

        if(p.value < root.value && q.value < root.value){
            return  lowestCommonAncestor(root.left,p,q);
        }else if(p.value > root.value && q.value > root.value){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }
*/


    /*
     * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
     * According to the definition of LCA on Wikipedia:
     *  “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants
     * (where we allow a node to be a descendant of itself).”
     * Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
     *
     *
     * */
/*    public static Node lowestCommonAncestorBinaryTree(Node root, Node p, Node q){

        // Koşul doğru ise recursive'i kesiyor sonucu aşağıdaki left'e veya right'a dönderiyor.
        if(p == root || q == root || root == null){
            return root;
        }

        Node left = lowestCommonAncestorBinaryTree(root.left, p, q);
        Node right =  lowestCommonAncestorBinaryTree(root.right, p, q);

        if (left == null) {
            return right;
        }else if (right == null){
            return left;
        }else{
            return root;
        }
    }*/

    /*
    * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
    * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
    * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
    * Note: You may not slant the container and n is at least 2.
    * Input: [1,8,6,2,5,4,8,3,7]
    * Output: 49
    * https://leetcode.com/problems/container-with-most-water/description/
    */

    public static int maxArea(int[] height){
        if(height == null || height.length == 0|| height.length ==  1) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int min = Integer.MIN_VALUE;
        int max = 0;
        while (start < end){
            min =  Math.min(height[start],height[end]);
            max = Math.max(max,min * (end - start));
            if (height[start] < height[end]) {
                start++;
            }else{
                end--;
            }
        }
        return max;
    }


    /*
    * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
    * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor,
    * "flood fill" the image.
    * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color
    *  as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel),
    * and so on. Replace the color of all of the aforementioned pixels with the newColor.
    * At the end, return the modified image.
    *
    * Input:
     * image = [[1,1,1],[1,1,0],[1,0,1]]
    * sr = 1, sc = 1, newColor = 2
    * Output: [[2,2,2],[2,2,0],[2,0,1]]
    *
    * https://leetcode.com/problems/flood-fill/
    */

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)
            return image;


        int step = 0;
        fill(image, sr, sc, image[sr][sc], newColor,step);

        return image;
    }

    private static void fill(int[][] image, int i, int j, int color, int newColor,int step) {

        image[i][j] = newColor;
        fill(image, i + 1, j, color, newColor,step);
        fill(image, i - 1, j, color, newColor,step);
        fill(image, i, j + 1, color, newColor,step);
        fill(image, i, j - 1, color, newColor,step);
    }



    /*
    * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
    *
    * Input: arr = [1,2,2,1,1,3]
    * Output: true
    *
    * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
    * Output: true
    *
    * https://leetcode.com/problems/unique-number-of-occurrences/
    * */
    public static boolean uniqueOccurrences(int[] arr) {

        if(arr.length  == 0 || arr == null){
            return false;
        }

        HashMap<Integer,Integer> maps = new HashMap<Integer, Integer>();

        for (int num : arr) {
            if (maps.containsKey(num)){
                maps.put(num,maps.get(num) + 1);
            }
            else{
                maps.put(num,1);
            }
        }

        Set<Integer> set = new HashSet<>();

        for(int key : maps.keySet()){
            set.add(maps.get(key));
        }

        if(maps.size() ==  set.size()){
            return true;
        }

        return false;

    }

    public boolean uniqueOccurrencesAnotherSolution(int[] arr) {
            int n = arr.length;
            int[] count = new int[n];
            int[] num = new int[2001];
            for(int i : arr) {
                int f = num[i+1000]++;
                if(f > 0)
                    count[f]--;
                count[f+1]++;
            }
            for(int i : count)
                if(i > 1) return false;
            return true;
    }






















}
