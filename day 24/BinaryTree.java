import java.util.LinkedList;
import java.util.Queue;


class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key = key;
        left=right=null;
    }
}


public class  BinaryTree{

    Node root;

    public void insert(int value){

        Node newNode = new Node(value);

        if(root == null){
            root = newNode;
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node current = q.poll();

            if(current.left == null){
                current.left = newNode;
                break;
            }else{
                q.offer(current.left);
            }

            if(current.right == null){
                current.right = newNode;
                break;
            }else{
                q.offer(current.right);
            }
        }
    }
    
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorder(root.left);
            
            preorder(root.right);
        }
    }
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
          
            postorder(root.right);
              System.out.print(root.key+" ");
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        System.out.println("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println("\nPreorder traversal: ");
        tree.preorder(tree.root);
        System.out.println("\nPostorder traversal: ");
        tree.postorder(tree.root);
    }
}