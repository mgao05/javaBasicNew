package com.company.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }


    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            int s = q.size();
            int max = -2147483648;
            for (int i = 0; i < s; i++) {
                TreeNode node = q.poll();
                int temp = node.val;
                max = Math.max(max, node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node4;
        node1.right = node3;
        node2.right = node5;
        Bfs bfs = new Bfs();
        System.out.println(bfs.largestValues(root));
    }


}
