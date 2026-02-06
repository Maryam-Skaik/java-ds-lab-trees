package assignment_solutions;

/**
 * Problem:
 * Find the maximum value in a binary tree.
 *
 * Approach:
 * - Base case: null → return Integer.MIN_VALUE
 * - Recur for left and right subtrees
 * - Return max of root.data, leftMax, rightMax
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
public class FindMax {

    public int findMax(Node<Integer> root) {
        if (root == null) return Integer.MIN_VALUE;

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
}
