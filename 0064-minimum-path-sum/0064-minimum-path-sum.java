class Solution {
    // public int minP(int i,int j,int[][]grid,int[][]dp)
    // {
    //     if(i==0 && j==0)
    //         return grid[0][0];
    //     if(i<0||j<0)
    //         return 10000000;
    //     if(dp[i][j]!=-1)
    //         return dp[i][j];
    //     int up=minP(i-1,j,grid,dp)+grid[i][j];
    //     int left=minP(i,j-1,grid,dp)+grid[i][j];
    //     return dp[i][j]=(int)Math.min(up,left);
    // }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=grid[0][0];
        int up=1000000,left=1000000;
        for(int i=0;i<m;i++)
        {
             up=1000000;left=1000000;
            for(int j=0;j<n;j++)
            {
            if(i>0)
             up=dp[i-1][j]+grid[i][j];
            if(j>0)
            left=dp[i][j-1]+grid[i][j]; 
            if(i==0 && j==0)
                continue;
            dp[i][j]=(int)Math.min(up,left);
            }
        }
        return dp[m-1][n-1];
    }
}