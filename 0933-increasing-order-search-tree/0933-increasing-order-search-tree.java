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
    TreeNode result=new TreeNode(-1);
    TreeNode current=result;
    public TreeNode increasingBST(TreeNode root) {
        backtrack(root);
        return result.right;
    }
    public void backtrack(TreeNode root){
        if(root==null){
            return;
        }
        backtrack(root.left);
        TreeNode node=new TreeNode(root.val);
        current.right=node;
        current=current.right;
        backtrack(root.right);
    }
}