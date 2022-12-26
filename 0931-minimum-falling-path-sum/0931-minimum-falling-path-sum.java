class Solution {
    int n;
    public int minFsum(int i,int j,int[][]mat,int[][]dp)
    {
        if(j<0||j>=n)
            return 1000000;//returnning a maximum value
        if(i==0)
            return mat[i][j];
        if(dp[i][j]!=-1000000)
            return dp[i][j];
        int up=mat[i][j]+minFsum(i-1,j,mat,dp);
        int left=mat[i][j]+minFsum(i-1,j-1,mat,dp);
         int right=mat[i][j]+minFsum(i-1,j+1,mat,dp);
        return dp[i][j]=Math.min(up,Math.min(left,right));
        
    }
    public int minFallingPathSum(int[][] matrix) {
         n=matrix.length;
        int dp[][]=new int[n][n];
        for(int[]rows:dp)
            Arrays.fill(rows,-1000000);
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)//This is the no. of column since ans can be from matrix[n-1][0] or //matrix[n-1][1]... and so on
        {
            mini=Math.min(mini,minFsum(n-1,i,matrix,dp));
        }
        return mini;
    }
}