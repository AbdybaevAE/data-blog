public static void dfs(Node root) {
    if (root == null) return;
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()) {
        Node node = stack.pop();
        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
        visit(node);
    }
}