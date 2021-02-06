public static void visit(Node node) {
    System.out.format("%s ->", node.val);
}
public static void inorder(Node node) {
    if (node == null) return;
    inorder(node.left);
    visit(node);
    inorder(node.right);
}
public static void preorder(Node node) {
    visit(node);
    preorder(node.left);
    preorder(node.right);
}
public static void postorder(Node node) {
    if (node == null) return;
    preorder(node.left);
    preorder(node.right);
    visit(node);
}