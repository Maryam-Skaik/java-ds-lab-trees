// Class to construct a binary tree from preorder and inorder arrays
public class BuildTreeFromTraversal {
    int index = 0; // Keeps track of root index in preorder array

    /**
     * Problem:
     * Construct a binary tree from given preorder and inorder traversals.
     *
     * Approach / Solution:
     * - Preorder traversal gives root node first.
     * - Find root index in inorder array to divide left and right subtrees.
     * - Recursively build left and right subtrees.
     */
    public Node buildTree(int pre[], int in[], int l, int r) {
        if (l > r) return null; // Base case: no elements

        Node<Integer> root = new Node<>(pre[index++]); // Root from preorder
        int mid = l;
        while (in[mid] != root.data) mid++; // Find root in inorder

        // Recursively build left and right subtrees
        root.left = buildTree(pre, in, l, mid - 1);
        root.right = buildTree(pre, in, mid + 1, r);

        return root;
    }
}
