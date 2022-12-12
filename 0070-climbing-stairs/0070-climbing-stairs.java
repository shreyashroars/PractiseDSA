class Solution {
    int[]dp;
    public int cl_st(int n)
    {
        if(n<=1)
          return 1;
        if(dp[n]!=-1)
            return dp[n];
         dp[n]=cl_st(n-2)+cl_st(n-1);
        return dp[n];
    }
    public int climbStairs(int n) {
      dp=new int[n+1];
    for(int i=0;i<dp.length;i++)
       dp[i]=-1;
        return cl_st(n);
    }
}