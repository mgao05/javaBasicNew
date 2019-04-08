package com.company.algorithm;

import javax.swing.tree.TreeNode;
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
    class TreeNode {
        int val;
        MaximumBinaryTree.TreeNode left;
        MaximumBinaryTree.TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return createSubTree(nums);
    }

    public int getMaxIndex(int[] nums) {
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

    public TreeNode createSubTree(int[] nums) {
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
}
//}
//
//public class MainClass {
//
//
//
//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }
//
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static String treeNodeToString(TreeNode root) {
//        if (root == null) {
//            return "[]";
//        }
//
//        String output = "";
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        nodeQueue.add(root);
//        while(!nodeQueue.isEmpty()) {
//            TreeNode node = nodeQueue.remove();
//
//            if (node == null) {
//                output += "null, ";
//                continue;
//            }
//
////            output += String.valueOf(node.val) + ", ";
////            nodeQueue.add(node.left);
////            nodeQueue.add(node.right);
//        }
//        return "[" + output.substring(0, output.length() - 2) + "]";
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            int[] nums = stringToIntegerArray(line);
//
//            //TreeNode ret = new MaximumBinaryTree().constructMaximumBinaryTree(nums);
//
////            String out = treeNodeToString(ret);
////
////            System.out.print(out);
//        }
//    }
//}