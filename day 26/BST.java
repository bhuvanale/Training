class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST {
    Node root;

    // Search function
    public boolean search(Node root, int val) {
        if (root == null)
            return false;

        if (root.data == val)
            return true;

        if (val < root.data)
            return search(root.left, val);
       
            return search(root.right, val);
    }

    // Insert function (for testing)
    public Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else if (val > root.data)
            root.right = insert(root.right, val);

        return root;
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        int searchKey = 10;
        if (tree.search(tree.root, searchKey))
            System.out.println(searchKey + " found in BST.");
        else
            System.out.println(searchKey + " not found in BST.");
    }
}
