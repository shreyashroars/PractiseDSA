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
        int dp[][]=new int[m+1][n+1];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
        return rec(m-1,n-1,dp);  
    }
}