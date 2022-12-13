class Solution {
     void dakaiti(int n,int[]nums,int[]dp)
    {
        dp[0]=nums[0];
       for(int i=1;i<=n;i++)
       {
           if(i==1)
           {
               dp[1]=Math.max(nums[0],nums[1]);
               continue;
           }
       int pick=nums[i]+dp[i-2];
       int ntpick=0+dp[i-1];
         dp[i]=(int)Math.max(pick,ntpick);
       }
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
     dakaiti(nums.length-1,nums,dp);
        return dp[nums.length-1];
    }
}