class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
         int dp[][]=new int[n][m];
        if(arr[0][0]==1)
            return 0;
        dp[0][0]=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 && j==0)
                    continue;
                if(arr[i][j]==1)
                    dp[i][j]=0;
                else
                {
                    int up=0;
                    if(i>=1)
                     up=dp[i-1][j];
                    int left=0;
                    if(j>=1)
                     left=dp[i][j-1];
                    dp[i][j]=up+left;
                }
                
            }
        }
        return dp[n-1][m-1];
        
        
    }
}