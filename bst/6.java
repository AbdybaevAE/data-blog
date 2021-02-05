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
}
