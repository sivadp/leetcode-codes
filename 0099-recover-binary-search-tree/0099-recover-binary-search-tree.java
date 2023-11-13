class Solution {
    TreeNode firstIncorrect = null;
    TreeNode secondIncorrect = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        // Initialize the pointers
        firstIncorrect = null;
        secondIncorrect = null;
        prev = null;

        // Traverse the tree to identify incorrectly placed nodes
        backtrack(root);

        // Swap the values of the incorrectly placed nodes
        if (firstIncorrect != null && secondIncorrect != null) {
            int temp = firstIncorrect.val;
            firstIncorrect.val = secondIncorrect.val;
            secondIncorrect.val = temp;
        }
    }

    private void backtrack(TreeNode root) {
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        backtrack(root.left);

        // Check the current node
        if (prev != null && prev.val >= root.val) {
            // If first incorrect node is not set, set it
            if (firstIncorrect == null) {
                firstIncorrect = prev;
            }
            // Always update the second incorrect node
            secondIncorrect = root;
        }

        // Update the previous node
        prev = root;
        // Traverse the right subtree
        backtrack(root.right);
    }
}
