class Solution {
    int n;
    public int minimumTotal(List<List<Integer>> t) {
        
        n=t.get(t.size()-1).size();
        int dp[][]=new int[n][n];
        for(int j=0;j<=n-1;j++)
            dp[n-1][j]=t.get(n-1).get(j);
        for(int i=n-2;i>=0;i--)
        {
            int d=Integer.MAX_VALUE,dg=Integer.MAX_VALUE;
            for(int j=i;j>=0;j--)
            {
          d=t.get(i).get(j)+dp[i+1][j];
         dg=t.get(i).get(j)+dp[i+1][j+1];
         dp[i][j]=d>dg?dg:d;
                
            }
        }
        return dp[0][0];
    }
}