class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        int [][] cache = new int [n1 + 1][n2 + 1];
        for (int i = 1; i <= n1; ++i) {
            for (int j = 1; j <= n2; ++j) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    cache[i][j] = cache[i-1][j-1] + 1;
                } else {
                    cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
                }
            }
        }
       
        int r = n1, c = n2;
        List<int[]> lcs = new ArrayList<>();
        while(r >= 1 && c >= 1 && cache[r][c] != 0) {
            if (r > 1 && cache[r-1][c] == cache[r][c]) r--;
            else if (c > 1 && cache[r][c-1] == cache[r][c]) c--;
            else {
                lcs.add(new int [] {r - 1, c - 1});
                r--;
                c--;
            }
        }
        Collections.reverse(lcs);
        int i = 0, j = 0, k = 0, n = lcs.size();
        StringBuilder ans = new StringBuilder();
        while(i < n1 && j < n2 && k < n) {
            boolean d1 = lcs.get(k)[0] == i, d2 = lcs.get(k)[1] == j;
            if (d1 && d2)  {
                ans.append(s1.charAt(i));
                ++k;
                ++i;
                ++j;
            } else if (d1 && !d2) {
                ans.append(s2.charAt(j++));
            } else if (!d1 && d2) {
                ans.append(s1.charAt(i++));
            } else {
                ans.append(s1.charAt(i++));
                ans.append(s2.charAt(j++));
            }
        }
        ans.append(s1.substring(i));
        ans.append(s2.substring(j));
        return ans.toString();
    }
    
}