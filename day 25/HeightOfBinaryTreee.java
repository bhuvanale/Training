class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key = key;
        left=right=null;
    }
}


public class HeightOfBinaryTreee {
    Node root;

    public int height(Node root){
        if(root == null){
            return 0;
        } 
        int leftH=height(root.left);
        int rightH= height(root.right);

        return 1+Math.max(leftH, rightH);
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
     HeightOfBinaryTreee tree = new HeightOfBinaryTreee();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.inorder(tree.root);
        System.out.println("\nHeight of tree: "+tree.height(tree.root));;
    }
}