package assignment_solutions;

/**
 * Problem:
 * Check whether two binary trees are structurally identical and have same values.
 *
 * Approach:
 * - If both nodes are null → return true
 * - If one null and other not → false
 * - If values differ → false
 * - Otherwise, recur for left and right subtrees
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
public class IsIdenticalTrees {

    public boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (!root1.data.equals(root2.data)) return false;

        return isIdentical(root1.left, root2.left) &&
               isIdentical(root1.right, root2.right);
    }
}
