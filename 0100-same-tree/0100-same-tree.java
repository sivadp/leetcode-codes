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
    boolean res=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        backtrack(p,q);
        return res;
    }
    private void backtrack(TreeNode p, TreeNode q){
        if(p==null&&q==null||!res){
            return;
        }
        else if(p!=null&&q==null||q!=null&&p==null||p.val!=q.val){
            res=false;
            return;
        }
        backtrack(p.left,q.left);
        backtrack(p.right,q.right);
    }
}