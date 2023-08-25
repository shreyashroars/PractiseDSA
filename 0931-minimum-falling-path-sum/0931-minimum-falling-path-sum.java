class Solution {
    public int rec(int[][] arr,int i,int j,int n,int dp[][])
    {
        if(i<0 ||j<0 ||i>=n||j>=n)
            return Integer.MAX_VALUE;
        if(i==n-1)
            return arr[i][j];
        if(dp[i][j]!=-1000000)
            return dp[i][j];
        return dp[i][j]=Math.min(rec(arr,i+1,j+1,n,dp),Math.min(rec(arr,i+1,j,n,dp),rec(arr,i+1,j-1,n,dp)))+arr[i][j];
    }
    public int minFallingPathSum(int[][] arr) {
        int n=arr.length;
        int dp[][]=new int[n][n];
        int min=Integer.MAX_VALUE;
        for(int rows[]:dp)
            Arrays.fill(rows,-1000000);
        for(int i=0;i<n;i++)
        min=Math.min(min,rec(arr,0,i,n,dp));
        return min;
    }
}