<h1 align="center">🌳 Data Structures Lab – Binary Trees (Java)</h1>

![Course](https://img.shields.io/badge/DS%20Lab-Week%205-%2373c2fb)
![Language](https://img.shields.io/badge/Java-Source_Code-%23e57373)
![Topic](https://img.shields.io/badge/Topic-Binary%20Trees-%23ffb74d)
![Level](https://img.shields.io/badge/Level-Intermediate-%2381c784)
![Purpose](https://img.shields.io/badge/Purpose-Teaching-%234fc3f7)

---

## 📺 Lecture Video
Watch the full Binary Trees lab lecture on YouTube:  
👉 [Binary Trees Lecture](https://youtu.be/your_video_link)

---

## 1. 🌟 Introduction

A **Binary Tree (BT)** is a hierarchical data structure where each node has at most **two children**: left and right. Binary trees are essential for:

- Efficient searching (Binary Search Trees)
- Expression parsing and evaluation
- Hierarchical data representation
- Recursion understanding

**Key Terminology:**
- **Root:** Topmost node
- **Leaf:** Node with no children
- **Height:** Longest path from root to a leaf
- **Depth:** Distance from root to node
- **Subtree:** Tree rooted at any node

---

## 2. 🧠 Core Concepts

### 🔹 Tree Node Structure
```java
public class TreeNode<T> {
    T data;
    TreeNode left;
    TreeNode right;

    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
```

**Explanation:**

- Each node contains a value (`data`) and pointers to **left** and **right** children.
- Root node is the starting point of the tree.

---

## 🔹 Binary Tree Traversals

Traversal means visiting nodes **in a specific order.**

### 1️⃣ Preorder Traversal (Root → Left → Right)

```java
void preorder(TreeNode root) {
    if (root == null) return;
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
```

**Mermaid Diagram**

```mermaid
graph TD
    %% Node styles
    style A fill:#f9d5e5,stroke:#ff6f61,stroke-width:2px,color:#000
    style B fill:#d0e6a5,stroke:#7cb342,stroke-width:2px,color:#000
    style C fill:#a0c4ff,stroke:#1e88e5,stroke-width:2px,color:#000
    style D fill:#ffb347,stroke:#ff6f00,stroke-width:2px,color:#000
    style E fill:#ffccd5,stroke:#d81b60,stroke-width:2px,color:#000

    %% Tree structure with node data
    A["Data: 1 (Root)"] --> B["Data: 2 (Left)"]
    A --> C["Data: 5 (Right)"]
    B --> D["Data: 3 (Left.Left)"]
    B --> E["Data: 4 (Left.Right)"]

    %% Preorder traversal hint (optional)
    classDef preorder fill:#fff9c4,stroke:#f57f17,stroke-width:1px,color:#000
    class A,B,D,E,C preorder
```

**✅ Preorder traversal order (data values):** `1 → 2 → 3 → 4 → 5`

**Explanation:**

- Visit **root first**, then traverse **left subtree**, then **right subtree**.
- Used for copying trees or expression evaluation.

---

### 2️⃣ Inorder Traversal (Left → Root → Right)

```java
void inorder(TreeNode root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
```

**Mermaid Diagram**

```mermaid
graph TD
    %% Node styles
    style A fill:#d0e6a5,stroke:#7cb342,stroke-width:2px,color:#000
    style B fill:#f9d5e5,stroke:#ff6f61,stroke-width:2px,color:#000
    style C fill:#a0c4ff,stroke:#1e88e5,stroke-width:2px,color:#000
    style D fill:#ffb347,stroke:#ff6f00,stroke-width:2px,color:#000
    style E fill:#ffccd5,stroke:#d81b60,stroke-width:2px,color:#000
    style F fill:#b39ddb,stroke:#512da8,stroke-width:2px,color:#000
    style G fill:#80deea,stroke:#0097a7,stroke-width:2px,color:#000

    %% Tree structure with data
    B["Data: 1 (Root)"] --> A["Data: 2 (Left)"]
    B --> C["Data: 3 (Right)"]
    A --> D["Data: 4 (Left.Left)"]
    A --> E["Data: 5 (Left.Right)"]
    C --> F["Data: 6 (Right.Left)"]
    C --> G["Data: 7 (Right.Right)"]

    %% Inorder traversal hint
    classDef inorder fill:#fff3e0,stroke:#fb8c00,stroke-width:1px,color:#000
    class D,A,E,B,F,C,G inorder
```

**✅ Inorder traversal order (data values):** `4 → 2 → 5 → 1 → 6 → 3 → 7`

**Explanation:**

- Left subtree → root → right subtree
- For **BST**, inorder traversal prints sorted values.

---

### 3️⃣ Postorder Traversal (Left → Right → Root)

```java
void postorder(TreeNode root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}
```

**Mermaid Diagram**

```mermaid
graph TD
    %% Node styles
    style A fill:#d0e6a5,stroke:#7cb342,stroke-width:2px,color:#000
    style B fill:#a0c4ff,stroke:#1e88e5,stroke-width:2px,color:#000
    style C fill:#f9d5e5,stroke:#ff6f61,stroke-width:2px,color:#000
    style D fill:#ffb347,stroke:#ff6f00,stroke-width:2px,color:#000
    style E fill:#ffccd5,stroke:#d81b60,stroke-width:2px,color:#000
    style F fill:#b39ddb,stroke:#512da8,stroke-width:2px,color:#000
    style G fill:#80deea,stroke:#0097a7,stroke-width:2px,color:#000

    %% Tree structure with data
    C["Data: 1 (Root)"] --> B["Data: 3 (Right)"]
    C --> A["Data: 2 (Left)"]
    A --> D["Data: 4 (Left.Left)"]
    A --> E["Data: 5 (Left.Right)"]
    B --> F["Data: 6 (Right.Left)"]
    B --> G["Data: 7 (Right.Right)"]

    %% Postorder traversal hint
    classDef postorder fill:#e0f7fa,stroke:#006064,stroke-width:1px,color:#000
    class D,E,A,F,G,B,C postorder
```

**✅ Postorder traversal order (data values):** `4 → 5 → 2 → 6 → 7 → 3 → 1`

**Explanation:**

- Visit left → right → root
- Used in **deleting a tree** or **expression evaluation.**

---

## 3. 📂 Repository Structure

```pgsql
java-ds-lab-trees/
│
├── README.md
│
├── src/
│   ├── examples/
│   │   ├── TreeNode.java
│   │   ├── BinaryTreeTraversal.java
│   │
│   ├── activities/
│   │   ├── HeightOfBinaryTree.java
│   │   ├── LevelOrderTraversal.java
│   │   ├── CheckHeightBalanced.java
│   │   ├── BuildTreeFromPreIn.java
│   │   └── LowestCommonAncestor.java
│   │
│   └── chapters/
│       └── Lecture 06 - Binary Trees.pdf
│
└── .gitignore
```

---

## 4. 🖥 Lecture Examples (Explained in Class)

### 🌲 Binary Tree Class

- Encapsulates the **TreeNode** root and basic methods.
- Supports traversal methods: **preorder, inorder, postorder.**
- Includes **example tree building** for demonstration.

```java
TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);
```

> This creates the tree:
> ```pgsql
>       1
>      / \
>     2   3
>    / \
>   4   5

---

## 5. 🎯 Activities (Student Practice)

These exercises are **for students to implement. No solutions are included here.**

| Activity                           | Concept                    | Hints                                            |
| ---------------------------------- | -------------------------- | ------------------------------------------------ |
| Height of Binary Tree              | Recursion, tree depth      | Use `max(leftHeight, rightHeight)+1`             |
| Level Order Traversal              | Queue + tree               | Use a queue to visit nodes level by level        |
| Check if Tree is Height Balanced   | Recursion, tree height     | Compare heights of left and right subtree        |
| Build Tree from Preorder & Inorder | Tree construction          | Use preorder[0] as root, split inorder array     |
| Lowest Common Ancestor             | Recursion, ancestor search | Traverse tree, return root if left & right exist |

---

## 6. 🏃 Running the Code

```bash
git clone https://github.com/Maryam-Skaik/java-ds-lab-trees.git
cd java-ds-lab-trees/src/examples
javac *.java
java BinaryTreeTraversal
```

---

## 7. 💡 Tips for Students

- Draw the tree before coding.
- Trace recursive calls manually.
- Remember traversal order:
  - **Preorder**: Root → Left → Right
  - **Inorder**: Left → Root → Right
  - **Postorder**: Left → Right → Root
 
---

## 8. 🎓 Learning Outcomes

After this lab, students will:

- Build and traverse binary trees
- Understand recursive tree operations
- Implement tree-based algorithms like LCA, height calculation, and level-order traversal
- Prepare for advanced tree structures (BST, AVL, Heaps)

---

## 9. 📝 License

This project is provided for educational use in the Java Data Structures Lab.
