class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        for (int i = 0; i < n; ++i) {
            if (colors[i] != 0) continue;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            colors[i] = 1;
            while (!queue.isEmpty()) {
                int v = queue.poll();
                for (int u : graph[v]) {
                    if (colors[u] == colors[v]) return false;
                    if (colors[u] == 0) {
                        colors[u] = -colors[v];
                        queue.offer(u);
                    }
                }
            }
        }
        return true;
    }
}