class Solution {
    public int rec(int [][] arr,int i,int j,int n,int m,int[][] dp)
    {
        if(i>=n ||j>=m || arr[i][j]==1)
            return 0;
        if(i==n-1 && j==m-1)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        return dp[i][j]=rec(arr,i+1,j,n,m,dp)+rec(arr,i,j+1,n,m,dp);
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
         int dp[][]=new int[n][m];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
        return rec(arr,0,0,n,m,dp);
        
    }
}