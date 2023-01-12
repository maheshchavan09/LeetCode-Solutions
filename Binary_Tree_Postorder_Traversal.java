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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        postorder(root, arr);
        return arr;
    }

    void postorder(TreeNode root1, ArrayList ar) {
        if (root1 == null)
            return;

        postorder(root1.left, ar);
        postorder(root1.right, ar);
        ar.add(root1.val);
    }
}
