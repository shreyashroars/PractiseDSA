class Solution {
    int n;
    public int minFallingPathSum(int[][] matrix) {
        
         n=matrix.length;
        int dp[][]=new int[n][n];
        for(int j=0;j<n;j++)
       dp[0][j]=matrix[0][j];
        for(int i=1;i<n;i++)
        {
            int up=1000000,left=1000000,right=1000000;
            for(int j=0;j<n;j++)
            {
                up=matrix[i][j]+dp[i-1][j];
                if(j>0)
                left=matrix[i][j]+dp[i-1][j-1];
                if(j<n-1)
                right=matrix[i][j]+dp[i-1][j+1];
                dp[i][j]=Math.min(up,Math.min(left,right));  
            }
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)//This is the no. of column since ans can be from matrix[n-1][0] or //matrix[n-1][1]... and so on
        {
            mini=Math.min(mini,dp[n-1][i]);
        }
        return mini;
    }
}