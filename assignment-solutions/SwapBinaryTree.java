package assignment_solutions;

/**
 * Problem:
 * Swap left and right children of every node in a binary tree.
 * This creates the mirror image of the original tree.
 *
 * Approach:
 * - Base case: null node → return
 * - Swap left and right
 * - Recur for left and right subtrees
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h) – recursion stack
 */
public class SwapBinaryTree {

    public void swapTree(Node root) {
        if (root == null) return;

        // Swap children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recur for children
        swapTree(root.left);
        swapTree(root.right);
    }
}
