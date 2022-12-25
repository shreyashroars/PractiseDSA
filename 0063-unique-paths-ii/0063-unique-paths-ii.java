class Solution {
        static int mazeob(int i,
  int j,int[][] mat,int[][] dp)
    {
        if(i==0 && j==0 && mat[i][j]!=1)
            return 1;
        if(i<0 ||j<0)
            return 0;
        if(mat[i][j]==1)
            return 0;
        if(dp[i][j]!=-1)
                return dp[i][j];
       int up=mazeob(i-1,j,mat,dp);
       int left=mazeob(i,j-1,mat,dp);
        return dp[i][j]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
          int [][] dp=new int[n][m];
        for(int []rows:dp)
            Arrays.fill(rows,-1);
        return mazeob(n-1,m-1,obstacleGrid,dp);
    }
}
