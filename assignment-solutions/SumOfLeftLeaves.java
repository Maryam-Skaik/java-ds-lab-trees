package binarytrees.assignment_solutions;

/**
 * Problem:
 * Sum values of all left leaf nodes in a binary tree.
 *
 * Approach:
 * - Base case: null → return 0
 * - If left child is a leaf → add its value
 * - Recur for left and right subtrees
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(Node<Integer> root) {
        if (root == null) return 0;

        int sum = 0;

        // Check if left is a leaf
        if (root.left != null &&
            root.left.left == null &&
            root.left.right == null) {
            sum += root.left.data;
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}
