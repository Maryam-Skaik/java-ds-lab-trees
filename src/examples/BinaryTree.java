package tree;

/**
 * Generic Binary Tree class supporting traversal and insertion.
 */
public class BinaryTree<T> {
    private Node<T> root; // root node of the tree
    
    // Node class representing each element in the tree
    public static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public BinaryTree() {
        this.root = null; // initially, tree is empty
    }
    
    // Add root node
    public void addRoot(T element){
        if(root != null) {
            System.out.println("Root already exists");
            return;
        }
        root = new Node<>(element);
    }
    
    // Add left child to a given parent
    public void addLeft(Node<T> parent, T element){
        if(parent == null) return;
        if(parent.left != null) return;
        parent.left = new Node<>(element);
    }
    
    // Add right child to a given parent
    public void addRight(Node<T> parent, T element){
        if(parent == null) return;
        if(parent.right != null) return;
        parent.right = new Node<>(element);
    }
    
    // Pre-order traversal: Root → Left → Right
    public void preorderTraversal(Node<T> root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    
    // In-order traversal: Left → Root → Right
    public void inorderTraversal(Node<T> root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    
    // Post-order traversal: Left → Right → Root
    public void postorderTraversal(Node<T> root){
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void main(String[] args) {
        BinaryTree<Character> binaryTree = new BinaryTree<>();
        
        Node<Character> root = new Node<>('A');
        Node<Character> left = new Node<>('B');
        Node<Character> right = new Node<>('C');
        
        binaryTree.root = root;
        root.left = left;
        root.right = right;
        
        binaryTree.addLeft(left, 'D');
        binaryTree.addRight(left, 'E');
        
        System.out.print("Preorder Traversal: ");
        binaryTree.preorderTraversal(root); // A B D E C
        System.out.println("\n-------------------");
        
        System.out.print("Inorder Traversal: ");
        binaryTree.inorderTraversal(root); // D B E A C
        System.out.println("\n-------------------");
        
        System.out.print("Postorder Traversal: ");
        binaryTree.postorderTraversal(root); // D E B C A
        System.out.println();
    }
}
