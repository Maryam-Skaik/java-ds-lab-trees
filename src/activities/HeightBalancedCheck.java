// Class to check if a binary tree is height-balanced
public class HeightBalancedCheck {

    /**
     * Problem:
     * Check whether a binary tree is height-balanced.
     * A tree is balanced if the heights of left and right
     * subtrees of every node are equal.
     *
     * Approach / Solution:
     * - Recursively calculate left and right subtree heights.
     * - If heights differ, return false.
     * - Recursively check left and right subtrees for balance.
     */
    public boolean isBalanced(Node root) {
        if (root == null) return true;

        int leftHeight = new TreeHeight().isBalanced(root.left);
        int rightHeight = new TreeHeight().isBalanced(root.right);

        if (leftHeight != rightHeight) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
}
