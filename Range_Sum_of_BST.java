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
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> arr = new ArrayList<>();
        preorder(root, arr, low, high);
        int sum = 0;
        for (int a : arr) {
            sum = sum + a;
        }
        return sum;

    }

    void preorder(TreeNode root, ArrayList arr, int low, int high) {
        if (root == null)
            return;
        if (root.val >= low && root.val <= high)
            arr.add(root.val);
        preorder(root.left, arr, low, high);
        preorder(root.right, arr, low, high);
    }
}