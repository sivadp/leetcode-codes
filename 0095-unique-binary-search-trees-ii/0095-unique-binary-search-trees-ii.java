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
    public List<TreeNode> generateTrees(int n) {
        return generateTree(1,n);
    }
    public List<TreeNode> generateTree(int start,int end){
        List<TreeNode> trees=new ArrayList<>();
        if(start>end){
            trees.add(null);
            return trees;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> leftTrees=generateTree(start,i-1);
            List<TreeNode> rightTrees=generateTree(i+1,end);
            for(TreeNode left:leftTrees){
                for(TreeNode right:rightTrees){
                    TreeNode tree=new TreeNode(i,left,right);
                    trees.add(tree);
                }
            }
        }
        return trees;
    }
}