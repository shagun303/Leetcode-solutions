class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0;i < m;i++){
            Arrays.fill(dp[i],-1);
        }
        return path(0,0,dp,m,n);
    }

    public int path(int i,int j ,int[][] dp ,int m ,int n ){
        if(i >= m || j >= n) return 0;
        if(i == m-1 || j == n-1) return 1;

        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] = path(i+1,j,dp,m,n)+path(i,j+1,dp,m,n);
        return dp[i][j];


    }
}
