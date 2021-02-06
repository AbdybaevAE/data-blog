public boolean search(int val) {
    return searchRecursively(root, val);
}
public boolean searchRecursively(Node node, int val) {
    if (node == null) return false;
    if (val > node.val) return searchRecursively(node.right, val);
    if (val < node.val) return searchRecursively(node.left, val);
    return true;
}