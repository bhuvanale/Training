// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Solution class with deleteNode method
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get inorder successor (min in right subtree)
            TreeNode minRight = findMin(root.right);
            root.val = minRight.val;
            root.right = deleteNode(root.right, minRight.val);
        }

        return root;
    }

    // Helper method to find the minimum node in a subtree
    TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

// Main class to test delete operation
public class Deletenodeex {
    public static void main(String[] args) {
        /*
               5
              / \
             3   6
            / \   \
           2   4   7
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        root.right = new TreeNode(6, null, new TreeNode(7));

        System.out.println("Inorder before deletion:");
        inorder(root);
        System.out.println();

        int keyToDelete = 3;
        Solution sol = new Solution();
        root = sol.deleteNode(root, keyToDelete);

        System.out.println("Inorder after deleting key " + keyToDelete + ":");
        inorder(root);
    }

    // Inorder traversal to verify tree structure
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
