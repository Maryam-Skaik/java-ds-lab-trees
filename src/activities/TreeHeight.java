// Class to calculate the height of a binary tree
public class TreeHeight {

    /**
     * Problem:
     * Find the height of a binary tree. Height is defined as the
     * number of edges in the longest path from root to a leaf node.
     *
     * Approach / Solution:
     * - Use recursion to calculate the height of left and right subtrees.
     * - Height of current node = 1 + max(left subtree height, right subtree height)
     * - Base case: if node is null, height is -1 (empty tree).
     */
    public int height(Node root) {
        if (root == null) return -1; // Base case: empty tree
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
