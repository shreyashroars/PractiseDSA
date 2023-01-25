class Solution {
    int target=0;
    public boolean equal_sum(int nums[],int dp[][],int i,int target)
    {
        if(target==0) return true;
        if(i==0)
            return nums[i]==target;
        if(dp[i][target]!=-1)
            return dp[i][target]==1?true:false;
        boolean not_take=equal_sum(nums,dp,i-1,target);
        boolean take=false;
        if(target>=nums[i])
            take=equal_sum(nums,dp,i-1,target-nums[i]);
        dp[i][target]=take||not_take?1:0;
        return take||not_take;
        
}
    public boolean canPartition(int[] nums) {
       int n=nums.length;
        for(int i=0;i<n;i++)
            target+=nums[i];
        if(target%2!=0)
            return false;
        int k=target/2;
        int dp[][]=new int[n][k+1];
        for(int rows[]:dp)
        {
        Arrays.fill(rows,-1);
        }
        return equal_sum(nums,dp,n-1,k);
    }
}