public int getHeight() {
    return getHeightRecursively(root);
}
public int getHeightRecursively(Node node) {
    if (node == null) return 0;
    return 1 + Math.max(getHeightRecursively(node.left), getHeightRecursively(node.right));
}