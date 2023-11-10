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
    boolean res=false;
    Set<Integer> val=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
       backtrack(root,k);
       return res;
    }
    private void backtrack(TreeNode root,int k){
        if(root==null){
            return;
        }
        backtrack(root.left,k);
        if(val.contains(k-root.val)){
            res=true;
        }
        else{
            val.add(root.val);
        }
        backtrack(root.right,k);
    }
}