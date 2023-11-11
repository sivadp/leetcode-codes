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
    List<Integer> sorted=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        bsttolist(root);
        return listtobst(0,sorted.size()-1,null);
    }
    private void bsttolist(TreeNode root){
        if(root==null) return;
        bsttolist(root.left);
        sorted.add(root.val);
        bsttolist(root.right);
    }
    private TreeNode listtobst(int left,int right,TreeNode prev){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(sorted.get(mid));
        root.left=listtobst(left,mid-1,root);
        root.right=listtobst(mid+1,right,root);
        return root;
    }
}