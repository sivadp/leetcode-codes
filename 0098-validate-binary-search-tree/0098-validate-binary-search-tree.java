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
    List<Integer> lister=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
       backtrack(root);
       for(int i=0;i<lister.size()-1;i++){
           if(lister.get(i)>=lister.get(i+1)){
               return false;
           }
       }
       return true;
    }
    public void backtrack(TreeNode root){
       if(root==null){
           return;
       }
       backtrack(root.left);
       lister.add(root.val);
       backtrack(root.right);
    }
}