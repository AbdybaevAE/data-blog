package play;

public class BinarySearchTree {
    public Node root;
    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
            return;
        } 
        insertRecursively(root, val); 
    }
    private Node insertRecursively(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;   
        }
        if (val > node.val) node.right = insertRecursively(node.right, val);
        if (val < node.val) node.left = insertRecursively(node.left, val);
        return node;
    }
    public void inorder() {
        System.out.println("Inorder traverse start");
        if (root == null) return;
        inorderRecursively(root);
        System.out.println("Inorder traverse end");
    }
    private void inorderRecursively(Node node) {
        if (node == null) return;
        inorderRecursively(node.left);
        System.out.println(node.val);
        inorderRecursively(node.right);
    }
}
