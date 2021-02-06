public int getMaximum() throws Exception {
    if (root == null) throw new NullPointerException();
    return getMaximumRecursively(root);
}
private int getMaximumRecursively(Node node) {
    if (node.right != null) return getMaximumRecursively(node.right);
    return node.val;
}