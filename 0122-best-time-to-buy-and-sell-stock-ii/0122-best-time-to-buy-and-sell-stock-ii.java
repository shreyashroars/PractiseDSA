class Solution {
    public int rec(int ind,int buy,int arr[],int n,int dp[][])
    {
        if(ind==n)
            return 0;
        if(dp[ind][buy]!=-1)
            return dp[ind][buy];
        if(buy==1)
        {
            int not_take=0+rec(ind+1,1,arr,n,dp);
            int take=-arr[ind]+rec(ind+1,0,arr,n,dp);
            return dp[ind][buy]=Math.max(take,not_take);
        }
        else
        {
            int not_take=0+rec(ind+1,0,arr,n,dp);
            int take=arr[ind]+rec(ind+1,1,arr,n,dp);
            return dp[ind][buy]=Math.max(take,not_take);
        }
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
        return rec(0,1,prices,n,dp);
        
    }
}