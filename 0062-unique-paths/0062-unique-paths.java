class Solution {
    public int rec(int i,int j,int dp[][])
    {
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        return dp[i][j]=rec(i-1,j,dp)+rec(i,j-1,dp);
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                    continue;
                int a=0;
                if(i>=1)
                    a=dp[i-1][j];
                int b=0;
                if(j>=1)
                    b=dp[i][j-1];
                dp[i][j]=a+b;
            }
        }
        return dp[m-1][n-1];
    }
}