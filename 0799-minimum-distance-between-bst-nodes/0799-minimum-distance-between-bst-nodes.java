/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int minDiff = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int minDiffInBST(TreeNode root) {
        backtrack(root);
        return minDiff;
    }

    private void backtrack(TreeNode root) {
        if (root == null) {
            return;
        }

        backtrack(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev.val);
        }

        prev = root;

        backtrack(root.right);
    }
}
