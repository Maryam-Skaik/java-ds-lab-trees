import java.util.*;

// Class to perform level order traversal of a binary tree
public class LevelOrderTraversal {

    /**
     * Problem:
     * Print the nodes of a binary tree level by level.
     *
     * Approach / Solution:
     * - Use a queue to traverse the tree in breadth-first order.
     * - Enqueue root node.
     * - While queue is not empty:
     *      - Dequeue node, print its value
     *      - Enqueue its children if they exist
     * - This ensures nodes are printed level by level.
     */
    public void levelorderTraversal(Node root) {
        if (root == null) return;

        LinkedListQueue<Node> queue = new LinkedListQueue<>();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.dequeue();
            System.out.print(currentNode.data + " ");

            if (currentNode.left != null) queue.enqueue(currentNode.left);
            if (currentNode.right != null) queue.enqueue(currentNode.right);
        }

        System.out.println();
    }
}
