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
    int count=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        backtrack(root,low,high);
        return count;
    }
    private void backtrack(TreeNode root, int low, int high){
        if(root==null){
            return;
        }
        if(root.val>=low&&root.val<=high){
            count+=root.val;
        }
        backtrack(root.left,low,high);
        backtrack(root.right,low,high);
    }
}