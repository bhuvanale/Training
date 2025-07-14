class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class NegFindBST {
    Node root;

    public boolean search(Node root, int val) {
        if (root == null)
            return false;

        if (root.data == val)
            return true;

        if (val < root.data)
            return search(root.left, val);
        else
            return search(root.right, val);
    }

    public Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else if (val > root.data)
            root.right = insert(root.right, val);

        return root;
    }

    public void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        NegFindBST tree = new NegFindBST();  
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, -10);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 13);
        tree.root = tree.insert(tree.root, -2);
        tree.root = tree.insert(tree.root, 4);

        int searchKey = -10;
        if (tree.search(tree.root, searchKey))
            System.out.println(searchKey + " found in BST.");
        else
            System.out.println(searchKey + " not found in BST.");

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
    }
}
