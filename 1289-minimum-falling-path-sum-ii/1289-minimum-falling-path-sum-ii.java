class Solution {
    int n;
    public int minFsum(int i,int j,int[][]mat,int[][]dp,int last_col)
    {
        int mini=10000000;
        if(i==0)
        {
            for(int k=0;k<n;k++)
            {
                if(k!=last_col)
                mini=Math.min(mini,mat[0][k]);
            }
            return mini;
        }
        if(dp[i][j]!=-100000)
            return dp[i][j];
        mini=10000000;
        for(int k=0;k<n;k++)
        {
            if(k!=last_col)
            mini=Math.min(mini,mat[i][k]+minFsum(i-1,k,mat,dp,k));
        }
        return dp[i][j]=mini;
    }
    public int minFallingPathSum(int[][] matrix) {
        n=matrix.length;
        int dp[][]=new int[n][n];
        for(int[]rows:dp)
            Arrays.fill(rows,-100000);
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)//This is the no. of column since ans can be from matrix[n-1][0] or //matrix[n-1][1]... and so on
        {
            mini=Math.min(mini,minFsum(n-1,i,matrix,dp,n));
        }
        return mini;
    }
}