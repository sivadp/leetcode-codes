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
    List<Integer> result=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        backtrack(root);
        return result;
    }
    public void backtrack(TreeNode root){
        if(root==null){
            return;
        }
        backtrack(root.left);
        result.add(root.val);
        backtrack(root.right);
    }
}