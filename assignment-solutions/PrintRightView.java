package assignment_solutions;

/**
 * Problem:
 * Print all nodes that are either the root or right children in the tree.
 *
 * Approach:
 * - Preorder traversal (root, left, right)
 * - Print the node if it's the root or a right child
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h) – recursion stack, h = height of tree
 */
public class PrintRightView {

    public void printAllRightNodes(Node root) {
        printRightNodesHelper(root, true); // root is considered a right node
        System.out.println();
    }

    private void printRightNodesHelper(Node node, boolean isRightChild) {
        if (node == null) return;

        if (isRightChild) {
            System.out.print(node.data + " ");
        }

        printRightNodesHelper(node.left, false);
        printRightNodesHelper(node.right, true);
    }
}
