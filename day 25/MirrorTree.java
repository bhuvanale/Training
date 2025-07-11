class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key = key;
        left=right=null;
    }
}
public class MirrorTree {
    Node root;
        public Node Mirror(Node root){
            if(root == null)return null;
            Node l = Mirror(root.left);
            Node r = Mirror(root.right);
            root.left=r;
            root.right=l;
            return root;
        }
        public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        MirrorTree tree= new MirrorTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        System.out.println("the  tree : ");
        tree.inorder(tree.root);
        tree.Mirror(tree.root);
        System.out.println("\nthe mirror matrix : ");
        tree.inorder(tree.root);
    }
}
