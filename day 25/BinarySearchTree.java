class Node{
    int data;
    Node left,right;

    public Node(int val){
        this.data = val;
        left = right = null;
    }
}


public class BinarySearchTree {
Node root;

public void insertVal(int val){
    Node newNode = new Node(val);
    if(root == null){
        root=newNode;
        return;
    }
    Node current = root;
    Node parent = null;

    while (current != null) {
        parent = current;

        if (val < current.data) {
            current = current.left;
        }
        else if(val > current.data){
            current = current.right;
        }
        else{
            return;
        }
    }
    if(val < parent.data){
        parent.left = newNode;
    }
    else{
        parent.right = newNode;
    }

}
public void inorder(Node root){
    if(root!=null){
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
 }
}

public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    int []arr ={5,34,62,1,6,9};
    for (int i : arr) {
        bst.insertVal(i);
    }
    bst.inorder(bst.root);
}
}
