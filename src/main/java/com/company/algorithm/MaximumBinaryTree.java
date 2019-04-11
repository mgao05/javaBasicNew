package com.company.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

//
// // Definition for a binary tree node.
//
//
///* -----------------------------------
// *  WARNING:
// * -----------------------------------
// *  Your code may fail to compile
// *  because it contains public class
// *  declarations.
// *  To fix this, please remove the
// *  "public" keyword from your class
// *  declarations.
// */
//
//
//
public class MaximumBinaryTree {
//    class TreeNode {
//        int val;
//        MaximumBinaryTree.TreeNode left;
//        MaximumBinaryTree.TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return createSubTree(nums);
    }

    public static int getMaxIndex(int[] nums) {
        int i = -1;
        int max = -1;
        for (int j = 0; j <= nums.length - 1; j++) {
            if (nums[j] >= max) {
                i = j;
                max = nums[j];
            }
        }
        return i;
    }

    public static TreeNode createSubTree(int[] nums) {
        int index = getMaxIndex(nums);
        if (index < 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[index]);
        int[] left = Arrays.copyOfRange(nums, 0, index);
        int[] right = Arrays.copyOfRange(nums, index + 1, nums.length);
        root.left = createSubTree(left);
        root.right = createSubTree(right);
        return root;
    }

    //TODO add main function

    public static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        String output = "";
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (node == null) {
                output += "null, ";
                continue;
            }

            output += String.valueOf(node.val) + ", ";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }

    public static void main(String[] args){

    int[] intArray = new int[]{1,3,5,6,7,8,9,25};

            TreeNode result = constructMaximumBinaryTree(intArray);

            String out = treeNodeToString(result);

            System.out.print(out);

    }
}
