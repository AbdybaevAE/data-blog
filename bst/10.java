public void inorder() {
    System.out.println("Inorder traverse start");
    if (root == null) return;
    inorderRecursively(root);
    System.out.println("Inorder traverse end");
}
private void inorderRecursively(Node node) {
    if (node == null) return;
    inorderRecursively(node.left);
    visitNode(node);
    inorderRecursively(node.right);
}
public void preorder() {
    System.out.println("Preorder traverse start");
    if (root == null) return;
    preorderRecursively(root);
    System.out.println("Preorder traverse end");
}
private void preorderRecursively(Node node) {
    if (node == null) return;
    visitNode(node);
    preorderRecursively(node.left);
    preorderRecursively(node.right);
}
public void postorder() {
    System.out.println("Postorder traverse start");
    if (root == null) return;
    postorderRecursively(root);
    System.out.println("Postorder traverse end");
}
private void postorderRecursively(Node node) {
    if (node == null) return;
    postorderRecursively(node.left);
    postorderRecursively(node.right);
    visitNode(node);
}
private void visitNode(Node node) {
    System.out.format("%s -> ",node.val);
}