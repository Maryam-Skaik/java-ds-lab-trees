package assignment_solutions;

import java.util.LinkedList;

/**
 * Problem:
 * Print all nodes visible from the right side of the tree.
 *
 * Approach:
 * - Level-order traversal using a queue
 * - For each level, print the last node
 *
 * Time Complexity: O(n)
 * Space Complexity: O(w) – maximum width of tree
 */
public class PrintRightView {

    public void printRightView(Node root) {
        if (root == null) return;

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node current = queue.remove();

                if (i == size - 1) { // last node in this level
                    System.out.print(current.data + " ");
                }

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        System.out.println();
    }
}
