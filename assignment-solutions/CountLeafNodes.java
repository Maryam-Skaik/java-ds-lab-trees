package assignment_solutions;

/**
 * Problem:
 * Count the number of leaf nodes in a binary tree.
 *
 * A leaf node is a node with no children (left == null && right == null)
 *
 * Approach:
 * - If node is null → return 0
 * - If node is leaf → return 1
 * - Otherwise, sum leaf counts from left and right subtrees recursively
 *
 * Time Complexity: O(n) – visit each node once
 * Space Complexity: O(h) – recursion stack, h = tree height
 */
public class CountLeafNodes {

    public int countLeafNodes(Node root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null)
            return 1;

        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
}
