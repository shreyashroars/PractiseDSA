class Solution {
    int dakaiti(int n,int[]nums,int[]dp)
    {
        if(n==0)return nums[0];
        if(n<0) return 0;
        if(dp[n]!=-1)return dp[n];
       int pick=nums[n]+dakaiti(n-2,nums,dp);
       int ntpick=0+dakaiti(n-1,nums,dp);
        return dp[n]=(int)Math.max(pick,ntpick);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
         Arrays.fill(dp, -1);
     return dakaiti(nums.length-1,nums,dp);
    }
}