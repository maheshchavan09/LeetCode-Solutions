/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        int mindifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (Math.abs(arr.get(i) - arr.get(j)) < mindifference)
                    mindifference = Math.abs(arr.get(i) - arr.get(j));
            }
        }
        return mindifference;
    }

    void preorder(TreeNode root, ArrayList arr) {
        if (root == null)
            return;

        arr.add(root.val);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }
}