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
    TreeNode root=null;
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        root=new TreeNode(preorder[0]);
        TreeNode current=root;
        index++;
        backtrack(preorder,current,prev);
        return root;
    }
    public void backtrack(int[] preorder,TreeNode current,TreeNode prev){
        if(index==preorder.length){
            return;
        }
        if(preorder[index]<current.val){
            current.left=new TreeNode(preorder[index]);
            index++;
            backtrack(preorder,current.left,current);
        }
        if(index==preorder.length){
            return;
        }
        if(prev==null||preorder[index]<prev.val){
            current.right=new TreeNode(preorder[index]);
            index++;
            backtrack(preorder,current.right,prev);
        }
        else{
            return;
        }
    }
}