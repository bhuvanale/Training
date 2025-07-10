
class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key = key;
        left=right=null;
    }
}


public class  BinaryTreeManual{

    Node root;

    
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(100);
        tree.root.left = new Node(200);
        tree.root.right = new Node(300);
        tree.root.left.left = new Node(1000);
        tree.root.left.right = new Node(2000);
        tree.root.right.right = new Node(4000);
        
        System.out.println("Inorder traversal: ");
        tree.inorder(tree.root);
       
    }
}