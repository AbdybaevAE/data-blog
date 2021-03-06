class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        int m = grid.length, n = grid[0].length;
        int fresh = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    ++fresh;
                }
            }
        }
        int [] dirs = new int [] {1,0, -1,0, 0,1, 0,-1};
        int time = 0;
        while(!queue.isEmpty()) {
            int s = queue.size();
            for (int k = 0; k < s; ++k) {
                Pair<Integer, Integer> p = queue.poll();
                int currRow = p.getKey(), currCol = p.getValue();
                for (int j = 0; j < 8; j+=2) {
                    int r = currRow + dirs[j], c = currCol + dirs[j+1];
                    if (r < 0 || c < 0 || r == m || c == n || 
                       grid[r][c] != 1) {
                        continue;
                    }
                    queue.offer(new Pair(r, c));
                    grid[r][c] = 2;
                    --fresh;
                }
            }
            ++time;
        }
        if (fresh == 0) return Math.max(0, time - 1);
        return -1;
    }
}