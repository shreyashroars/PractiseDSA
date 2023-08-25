class Solution {
    public int rec(int[][]arr,int i,int j,int[][] dp)
    {
        if(i<0 ||j<0)
            return Integer.MAX_VALUE;
        if(i==0&& j==0)
            return arr[0][0];
        if(dp[i][j]!=-1)
            return dp[i][j];
        return dp[i][j]=Math.min(rec(arr,i-1,j,dp),rec(arr,i,j-1,dp))+arr[i][j];
    }
    public int minPathSum(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int dp[][]=new int[m][n];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
       return rec(arr,m-1,n-1,dp);
        
    }
}