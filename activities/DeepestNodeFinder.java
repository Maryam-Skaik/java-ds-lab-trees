// Class to find the deepest node in a binary tree
public class DeepestNodeFinder {

    /**
     * Problem:
     * Find the deepest (last) node in a binary tree.
     *
     * Approach / Solution:
     * - Use level order traversal (BFS) using a queue.
     * - The last node processed in BFS is the deepest node.
     */
    public Node deepestNode(Node root) {
        if (root == null) return null;

        LinkedListQueue<Node> queue = new LinkedListQueue<>();
        queue.enqueue(root);

        Node currentNode = null;
        while (!queue.isEmpty()) {
            currentNode = queue.dequeue();

            if (currentNode.left != null) queue.enqueue(currentNode.left);
            if (currentNode.right != null) queue.enqueue(currentNode.right);
        }

        return currentNode;
    }
}
