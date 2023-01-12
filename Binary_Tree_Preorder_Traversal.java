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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        return arr;
    }

    void preorder(TreeNode root1, ArrayList ar) {
        if (root1 == null)
            return;

        ar.add(root1.val);
        preorder(root1.left, ar);
        preorder(root1.right, ar);
    }
}