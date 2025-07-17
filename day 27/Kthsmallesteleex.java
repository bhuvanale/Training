// TreeNode class definition
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

// Solution class with kthSmallest method
class Solution {
    int count = 0, result = -1;

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) return -1;
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        inorder(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        inorder(node.right, k);
    }
}

// Main class to test the code
public class Kthsmallesteleex {
    public static void main(String[] args) {
        /*
              5
             / \
            3   6
           / \
          2   4
         /
        1
        */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4));
        root.right = new TreeNode(6);

        Solution sol = new Solution();
        int k = 3;  // Change this value to test different kth values
        int kthSmallest = sol.kthSmallest(root, k);

        System.out.println("The " + k + "rd smallest element in the BST is: " + kthSmallest);
    }
}
