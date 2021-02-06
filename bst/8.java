public int getMinimum() throws Exception {
    if (root == null) throw new NullPointerException();
    return getMinimumRecursively(root);
}
private int getMinimumRecursively(Node node) {
    if (node.left != null) return getMinimumRecursively(node.left);
    return node.val;
}