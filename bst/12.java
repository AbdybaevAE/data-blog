public void deleteValue(int val) {
    deleteRecursively(root, val);
}
private Node deleteRecursively(Node node, int val) {
    if (node == null) return node;
    if (val > node.val) {
        node.right = deleteRecursively(node.right, val);
    } else if (val < node.val) {
        node.left = deleteRecursively(node.left, val);
    } else {
        if (node.left == null) return node.left;
        if (node.right == null) return node.right;
        int minNodeOnRightSubtreeValue = getMinimumRecursively(node.right);
        node.val = minNodeOnRightSubtreeValue;
        node.right = deleteRecursively(node.right, minNodeOnRightSubtreeValue);
    }
    return node;
}