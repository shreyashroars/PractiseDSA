class Solution {
    int n;
    int minCostClimb(int i,int[]cost,int[]dp)
    {
        if(i>=n)
            return 0;
        if(i==n-1)
            return cost[i];
        if(dp[i]!=-1)
            return dp[i];
        int oneStep=cost[i]+minCostClimb(i+1,cost,dp);
        int twoStep=cost[i]+minCostClimb(i+2,cost,dp);
        return dp[i]=oneStep<twoStep?oneStep:twoStep;
    }
    public int minCostClimbingStairs(int[] cost) {
         n=cost.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int a= minCostClimb(0,cost,dp);
        int b=minCostClimb(1,cost,dp);
        return a<b?a:b;
        
    }
}