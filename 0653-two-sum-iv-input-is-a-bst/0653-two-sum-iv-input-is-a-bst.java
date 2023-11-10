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
    public boolean findTarget(TreeNode root, int k) {
       Set<Integer> val=new HashSet<>();
       TreeNode current=root;
       while(current!=null){
           if(current.left==null){
               if(val.contains(k-current.val))return true;
               val.add(current.val);
               current=current.right;
           }
           else{
               TreeNode temp=current.left;
               while(temp.right!=null&&temp.right!=current){
                   temp=temp.right;
               }
               if(temp.right==current){
                   temp.right=null;
                   current=current.right;
               }
               else{
                   if(val.contains(k-current.val))return true;
                   val.add(current.val);
                   temp.right=current;
                   current=current.left;
               }
           }
       }
       System.out.println(val);
       return false;
    }
}