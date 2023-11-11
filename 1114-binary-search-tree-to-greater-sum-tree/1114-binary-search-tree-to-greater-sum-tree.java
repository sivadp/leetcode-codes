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
    TreeNode prev=null;
    public TreeNode bstToGst(TreeNode root) {
        backtrack(root);
        return root;
    }
    public void backtrack(TreeNode root){
        if(root==null){
            return;
        }
        backtrack(root.right);
        if(prev!=null){
            root.val=root.val+prev.val;
        }
        prev=root;
        backtrack(root.left);
    }
}