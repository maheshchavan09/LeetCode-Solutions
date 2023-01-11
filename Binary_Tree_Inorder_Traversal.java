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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }

    void inorder(TreeNode root1, List ar) {
        if (root1 == null)
            return;

        inorder(root1.left, ar);
        ar.add(root1.val);
        inorder(root1.right, ar);
    }
}