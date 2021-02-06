public static void bfs(Node root) {
    if (root == null) return;
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()) {
        int size = queue.size();
        for (int j = 0; j < size; ++j) {
            Node node = queue.poll();
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
            visit(node);
        }
    }
}